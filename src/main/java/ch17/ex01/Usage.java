package ch17.ex01;
import java.util.HashMap;
import java.util.Map;

public class Usage {
    private static int num = 0;

    public static void main(String[] args) {
        printUsage();
        Map<String, String> map = new HashMap<String, String>(1);
        for (int i = 0; i < 10000; i++)
            map.put("#" + i, "abc");
        printUsage();
        System.gc();
        printUsage();
        System.gc();
        printUsage();
        System.gc();
        printUsage();
    }

    public static void printUsage() {
        Runtime runtime = Runtime.getRuntime();
        double par = runtime.freeMemory() / (double) runtime.totalMemory();
        System.out.printf("%d %f%%%n", ++num, par * 100);
    }

    /*
     * <pre>
1 99.623483%
2 99.230570%
3 87.392589%
4 77.943897%
5 77.943897%
     * </pre>
     */
}
