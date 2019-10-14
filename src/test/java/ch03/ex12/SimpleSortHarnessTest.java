package ch03.ex12;

import org.junit.Assert;
import org.junit.Test;

public class SimpleSortHarnessTest {
    @Test
    public void sortTest() throws Exception {
        final SimpleSortHarness s = new SimpleSortHarness((o1, o2) -> {
            final String s1 = (String) o1;
            final String s2 = (String) o2;
            return s1.compareTo(s2);
        });

        final String[] values = new String[]{"c", "b", "a", "d"};
        final SortMetrics result = s.sort(values);
        Assert.assertEquals(3, result.swapCnt);
    }
}