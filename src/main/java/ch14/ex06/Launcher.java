package ch14.ex06;

class Launcher {
    public static void main(String[] args) {
        launch();
    }

    private static void launch() {
        MessageThread messageThread1 = new MessageThread(15, "every 15 sec.");
        messageThread1.start();
        MessageThread messageThread2 = new MessageThread(7, "every 7 sec.");
        messageThread2.start();
        TimerThread timer = new TimerThread(messageThread1, messageThread2);
        timer.start();
    }
}
