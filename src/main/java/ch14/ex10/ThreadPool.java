/*
 * Copyright (C) 2012, 2013 RICOH Co., Ltd. All rights reserved.
 * Copyright (C) 2019 Yoshiki Shibata. All rights reserved.
 */

package ch14.ex10;

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
    private final int queueSize;
    private final Queue<Thread> poolQueue;
    private enum State {NEW, RUNNING, STOPPED}
    private volatile State state = State.NEW;

    /**
     * Constructs ThreadPool.
     *
     * @param queueSize the max size of queue
     * @param numberOfThreads the number of threads in this pool.
     *
     * @throws IllegalArgumentException if either queueSize or numberOfThreads
     *         is less than 1
     */
    public ThreadPool(final int queueSize, final int numberOfThreads) {
        if (queueSize < 1 || numberOfThreads < 1) {
            throw new IllegalArgumentException();
        }
        this.queueSize = queueSize;
        poolQueue = new LinkedList<>();
        for (int i = 0; i < numberOfThreads; i++) {
            poolQueue.add(new Worker());
        }
    }

    /**
     * Starts threads.
     *
     * @throws IllegalStateException if threads has been already started.
     */
    public void start() {
    if (poolQueue.isEmpty()) {
        throw new IllegalStateException();
    }
    if (poolQueue.stream().anyMatch(t -> t.isAlive())) {
        throw new IllegalStateException();
        }
    synchronized (poolQueue) {
        poolQueue.stream().filter(t -> !t.isAlive()).filter(t -> Objects.equals(t.getState(), Thread.State.NEW)).findAny().orElseThrow(() -> new IllegalStateException()).start();
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
    public void stop() {
        if (poolQueue.isEmpty()) {
            throw new IllegalStateException();
        }
        synchronized (poolQueue) {
            // どう状態をふりわければいいかが分からない……．
            if (poolQueue.stream().allMatch(t -> Objects.equals(t.getState(), Thread.State.NEW))) {
                throw new IllegalStateException();
            }
            if (Objects.equals(this.state, State.STOPPED)) {
                throw new IllegalStateException();
            }
            poolQueue.stream().forEach( t -> {
                try {
                    t.join();
                } catch (final InterruptedException e) {
                    e.printStackTrace();
                }
            });
            this.state = State.STOPPED;
        }
    }

    /**
     * Executes the specified Runnable object, using a thread in the pool.
     * run() method will be invoked in the thread. If the queue is full, then
     * this method invocation will be blocked until the queue is not full.
     *
     * @param runnable Runnable object whose run() method will be invoked.
     *
     * @throws NullPointerException if runnable is null.
     * @throws IllegalStateException if this pool has not been started yet.
     */
    public void dispatch(Runnable runnable) {
        if (runnable == null)
            throw new NullPointerException();
        if (Objects.equals(this.state, State.NEW))
            throw new IllegalStateException("Not statrted.");
        poolQueue.add((Thread) runnable);
    }

    private class Worker extends Thread {
        @Override
        public void run() {
            try {
                Thread.sleep(100000);
            } catch (final InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
