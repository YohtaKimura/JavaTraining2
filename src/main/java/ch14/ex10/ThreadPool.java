/*
 * Copyright (C) 2012, 2013 RICOH Co., Ltd. All rights reserved.
 * Copyright (C) 2019 Yoshiki Shibata. All rights reserved.
 */

package ch14.ex10;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

/**
 * Simple Thread Pool class.
 *
 * This class can be used to dispatch an Runnable object to
 * be exectued by a thread.<br><br>
 *
 * [Instruction]
 * <ul>
 *  <li> Implement one constructor and three methods. </li>
 *  <li> Don't forget to write a Test program to test this class. </li>
 *  <li> Pay attention to @throws tags in the javadoc. </li>
 *  <li> If needed, you can put "synchronized" keyword to methods. </li>
 *  <li> All classes for implementation must be private inside this class. </li>
 *  <li> Don't use java.util.concurrent package. </li>
 *  <li> Don't use {@link java.lang.Thread#interrupt}  method to stop a thread</li>
 *  </ul>
 *
 *  @author Yoshiki Shibata
 */
public class ThreadPool {
    private final int numberOfThread;
    private final int queueSize;
    private volatile Queue<Runnable> taskPoolQueue;
    private final Queue<Worker> threadPoolQueue;
    private final StopTask stopTask = StopTask.getStopTask();
    private enum State {NEW, RUNNING, STOPPED}
    private volatile State state = State.NEW;

    /**
     * Constructs ThreadPool.
     *
     * @param queueSize       the max size of queue
     * @param numberOfThreads the number of threads in this pool.
     * @throws IllegalArgumentException if either queueSize or numberOfThreads
     *                                  is less than 1
     */
    public ThreadPool(final int queueSize, final int numberOfThreads) {
        if (queueSize < 1 || numberOfThreads < 1) {
            throw new IllegalArgumentException();
        }
        this.numberOfThread = numberOfThreads;
        this.queueSize = queueSize;
        taskPoolQueue = new ArrayDeque<>(queueSize);
        threadPoolQueue = new LinkedList<>();
        for (int i = 0; i < numberOfThreads; i++) {
            threadPoolQueue.add(new Worker(taskPoolQueue));
        }
    }

    /**
     * Starts threads.
     *
     * @throws IllegalStateException if threads has been already started.
     */
    public synchronized void start() {
        if (threadPoolQueue.isEmpty()) {
            throw new IllegalStateException();
        }
        synchronized (threadPoolQueue) {
            Thread.State a = threadPoolQueue.element().getState();
            boolean b = threadPoolQueue.stream().anyMatch(t -> t.isAlive());
            if (threadPoolQueue.stream().anyMatch(t -> t.isAlive() ||
                    Objects.equals(t.getState(), Thread.State.TIMED_WAITING) ||
                    Objects.equals(t.getState(), Thread.State.WAITING) ||
                    Objects.equals(t.getState(), Thread.State.BLOCKED) ||
                    Objects.equals(t.getState(), Thread.State.TERMINATED) ||
                    Objects.equals(t.getState(), Thread.State.RUNNABLE) ||
                    Objects.equals(t.getState(), Thread.State.TERMINATED))) {
                throw new IllegalStateException();
            }
            System.out.println("startInThreadPool");
            threadPoolQueue.stream().forEach(t -> t.start());
            state = State.RUNNING;
        }
    }

    /**
     * Stop all threads gracefully and wait for their terminations.
     * All requests dispatched before this method is invoked must complete
     * and this method also will wait for their completion.
     *
     * @throws IllegalStateException if threads has not been started.
     */
    public synchronized void stop() {
        if (threadPoolQueue.isEmpty()) {
            throw new IllegalStateException();
        }
        synchronized (threadPoolQueue) {
            // どう状態をふりわければいいかが分からない……．
            if (threadPoolQueue.stream().allMatch(t -> Objects.equals(t.getState(), Thread.State.NEW))) {
                throw new IllegalStateException();
            }
            if (Objects.equals(this.state, State.STOPPED)) {
                throw new IllegalStateException();
            }
            ;
            for (int i = 0; i < this.numberOfThread; i++)
                dispatch(stopTask);
            while (!areAllThreadsStopped()) {
                synchronized (this.threadPoolQueue) {
                    threadPoolQueue.stream().forEach(t -> {
                        synchronized (t) {
                            t.notifyAll();
                        }
                    });
                }
            }
            this.state = State.STOPPED;
        }
    }

    /**
     * Executes the specified Runnable object, using a thread in the pool.
     * run() method will be invoked in the thread. If the queue is full, then
     * this method invocation will be blocked until the queue is not full.
     *
     * @param runnable Runnable object whose run() method will be invoked.
     * @throws NullPointerException  if runnable is null.
     * @throws IllegalStateException if this pool has not been started yet.
     */
    public synchronized void dispatch(final Runnable runnable) {
        if (runnable == null)
            throw new NullPointerException();
        if (Objects.equals(this.state, State.NEW))
            throw new IllegalStateException("Not statrted.");
//        taskPoolQueue.add(runnable);
        //implement available;
        boolean a = threadPoolQueue.stream().allMatch(t -> Objects.equals(t.getState(), Thread.State.TERMINATED));
        if (threadPoolQueue.stream().allMatch(t -> Objects.equals(t.getState(), Thread.State.TERMINATED))) {
            return;
        }

        while (!(threadPoolQueue.stream().anyMatch(t -> Objects.equals(t.getState(), Thread.State.WAITING)))) {
            synchronized (this.threadPoolQueue) {
                threadPoolQueue.stream().forEach(t -> {
                    synchronized (t) {
                        t.notifyAll();
                    }
                });
            }

            if (threadPoolQueue.stream().allMatch(t -> Objects.equals(t.getState(), Thread.State.TERMINATED))) {
                break;
            }
        }

        while (Objects.equals(taskPoolQueue.size(), this.queueSize)) {
                threadPoolQueue.stream().forEach(t -> {
                    synchronized (t) {
                        t.notifyAll();
                    }
              });
        }
        taskPoolQueue.offer(runnable);
        synchronized (this.threadPoolQueue) {
                threadPoolQueue.stream().forEach(t -> {
                    Thread.State z = t.getState();
                    synchronized (t) {
                        t.notifyAll();
                    }
              });
            }
    }

    public synchronized boolean areAllThreadsStopped() {
        threadPoolQueue.stream().forEach(t -> System.out.println(t.getState().toString()));
        return threadPoolQueue.stream().allMatch(t -> Objects.equals(t.getState(), Thread.State.TERMINATED));
    }
}

class Worker extends Thread {
    private volatile Queue<Runnable> taskQueue;
    private volatile Runnable task = null;
    private volatile boolean shouldStop = false;
    private volatile StopTask stopTask = StopTask.getStopTask();

    Worker(final Queue<Runnable> taskQueue) {
        this.taskQueue = taskQueue;
    }

    public synchronized void setRunnable(final Runnable runnable) {
        this.task = runnable;
        notifyAll();
    }

    @Override
    public synchronized void run() {
        while (!shouldStop) {
            synchronized (taskQueue) {
                while (taskQueue.isEmpty()) {
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("notified and taskQueue is not empty");
                Runnable task = taskQueue.poll();
                if (Objects.equals(task, stopTask)) {
                    this.shouldStop = true;
                    break;
                }
                task.run();
                notifyAll();
            }
        notifyAll();
        }
    }

    public boolean isNotTaskSet() {
        return Objects.isNull(task);
    }

    boolean hasStopTask() {
        return Objects.equals(this.task, this.stopTask);
    }
}

class StopTask implements Runnable {
    private static final StopTask stopTask = new StopTask();

    private StopTask() {}

    static StopTask getStopTask() {
        return stopTask;
    }

    @Override
    public void run() {
        System.out.println("hey");
        }
}
