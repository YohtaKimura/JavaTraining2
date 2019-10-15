package ch03.ex11;

import org.junit.Assert;
import org.junit.Test;

public class SimpleSortDoubleTest {
    @Test
    public void sortTest() throws Exception {
        final SimpleSortDouble s = new SimpleSortDouble();

        final double[] values = {20.0, 10.1, 12.3, 3.2};
        final SortMetrics result = s.sort(values);
        System.out.println(s.probe(0));
        System.out.println(s.probe(1));
        System.out.println(s.probe(2));
        System.out.println(s.probe(3));
        // Assert.assertEquals(5, result.swapCnt);
        Assert.assertEquals(0, result.swapCnt);
    }
}