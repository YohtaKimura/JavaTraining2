package ch03.ex05;

class AnotherBenchmark extends Benchmark {
    public static void main(String[] args) {
        int count;
        if (args.length == 0) {
            count = 0;
        } else {
            count = Integer.parseInt(args[0]);
        }
        long time = new AnotherBenchmark(100).repeat(count);
        System.out.println(count + " methods in " +
                time + " nanoseconds");
    }

    private int maxNumberOfIteration;
    AnotherBenchmark(int maxNumberOfIteration){
        this.maxNumberOfIteration = maxNumberOfIteration;
    }

    @Override
    void benchmark() {
        for (int i = 0; i < maxNumberOfIteration; i++) {
        }
    }

    public int getMaxNumberOfIteration() {
        return this.maxNumberOfIteration;
    }
}
