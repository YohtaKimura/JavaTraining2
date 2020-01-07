package ch14.ex07;

class Babble extends Thread {
    static boolean doYield;
    static int howOften;
    private String word;

    Babble(String whatToSay) {
        word = whatToSay;
    }

    public void run() {
        for (int i = 0; i < howOften; i++) {
            System.out.println(word);
            if (doYield)
                Thread.yield();
        }
    }

    // TODO: Delete main and add test.
    public static void main(String[] args) {
        String[] test1 = { "true", "2", "Did", "DidNot" };
        doYield = Boolean.parseBoolean(test1[0]);
        howOften = Integer.parseInt(test1[1]);

        for (int i = 2; i < args.length; i++)
            new Babble(test1[i]).start();
    }
}
