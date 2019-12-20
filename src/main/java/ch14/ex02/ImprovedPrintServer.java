package ch14.ex02;

class ImprovedPrintServer implements Runnable{
    // TODO: 問題は Thread.currentThread を使用して，run メソッドを呼び出しているスレッドがどれかを調べて本来のワーカースレッドと比較して同じかどうか評価すること．
    // TODO: どうテストしよう……．例外なげてキャッチしようとしたら、@Overrride に怒られたし……．
    private PrintQueue requests = new PrintQueue();
    private final Thread myThread;
    public ImprovedPrintServer() {
        new Thread(this).start();
        myThread =  Thread.currentThread();
    }
    public void print(PrintJob job) {
        requests.add(job);
    }
    @Override
    public void run() {
        if (myThread != Thread.currentThread()) {
            return;
        }
        for(;;) {
            realPrint(requests.remove());
        }
    }
    private void realPrint(PrintJob job) {
        // 印刷の実際の処理を行なう
    }
}
