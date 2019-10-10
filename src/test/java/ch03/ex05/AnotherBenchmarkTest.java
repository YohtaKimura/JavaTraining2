package ch03.ex05;

import org.junit.Assert;
import org.junit.Test;

public class AnotherBenchmarkTest {
    @Test
    public void checkIterator() throws Exception {
        final AnotherBenchmark b = new AnotherBenchmark(4);
        Assert.assertEquals(4, b.getMaxNumberOfIteration());
    }

    @Test
    public void checkMain() throws Exception {
        try {
            final String[] args = {"3"};
            AnotherBenchmark.main(args);
        } catch (Exception e) {
            Assert.fail();
        }

    }
}
