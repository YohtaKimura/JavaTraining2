package ch03.ex05;

import org.junit.Assert;
import org.junit.Test;

public class AnotherBenchmarkTest {
    @Test
    public void getNumberOfPassenger() throws Exception {
        final AnotherBenchmark b = new AnotherBenchmark(4);
        Assert.assertEquals(4, b.getMaxNumberOfIteration());
    }
}
