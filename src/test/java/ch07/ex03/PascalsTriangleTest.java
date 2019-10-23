package ch07.ex03;

import org.junit.Assert;
import org.junit.Test;

public class PascalsTriangleTest {
    @Test
    public void factTest() {
        Assert.assertEquals(6, PascalsTriangle.fact(3));
    }
    @Test
    public void pascalsTriangle() {
        final int[][] triangle = {
                { 1 },
                { 1, 1 },
                { 1, 2, 1 },
                { 1, 3, 3, 1 },
                { 1, 4, 6, 4, 1 },
                { 1, 5, 10, 10, 5, 1 },
                { 1, 6, 15, 20, 15, 6, 1 },
                { 1, 7, 21, 35, 35, 21, 7, 1 },
                { 1, 8, 28, 56, 70, 56, 28, 8, 1 },
                { 1, 9, 36, 84, 126, 126, 84, 36, 9, 1},
                { 1, 10, 45, 120, 210, 252, 210, 120, 45, 10, 1 },
                { 1, 11, 55, 165, 330, 462, 462, 330, 165, 55, 11, 1}
        };
        Assert.assertArrayEquals(triangle, PascalsTriangle.getPascalsTriangle(12));
    }
    @Test
    public void pascalsTrianglePrint() {
        final int[][] triangle = {
                { 1 },
                { 1, 1 },
                { 1, 2, 1 },
                { 1, 3, 3, 1 },
                { 1, 4, 6, 4, 1 },
                { 1, 5, 10, 10, 5, 1 },
                { 1, 6, 15, 20, 15, 6, 1 },
                { 1, 7, 21, 35, 35, 21, 7, 1 },
                { 1, 8, 28, 56, 70, 56, 28, 8, 1 },
                { 1, 9, 36, 84, 126, 126, 84, 36, 9, 1},
                { 1, 10, 45, 120, 210, 252, 210, 120, 45, 10, 1 },
                { 1, 11, 55, 165, 330, 462, 462, 330, 165, 55, 11, 1}
        };
        Assert.assertArrayEquals(triangle, PascalsTriangle.getPascalsTriangle(12)); // dummy test
        PascalsTriangle.printTwoDIntArray(triangle);
    }
}