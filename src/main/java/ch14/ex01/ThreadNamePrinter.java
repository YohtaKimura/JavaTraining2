package ch14.ex01;

class ThreadNamePrinter {
    public static void main(String[] args){
        // Tread[main,5,main] みたいなのがスレッド名……？教科書には Thread-1 とか書いてあるけど……．
        System.out.println(Thread.currentThread());
    }
}
