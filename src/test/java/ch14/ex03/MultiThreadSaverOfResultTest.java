package ch14.ex03;

import org.junit.Test;

public class MultiThreadSaverOfResultTest {
    @Test
    public void countCharTest() throws Exception {
        final MultiThreadSaverOfResult multiThreadSaverOfResult = new MultiThreadSaverOfResult();
        multiThreadSaverOfResult.start();
        multiThreadSaverOfResult.print();
        // 結果がイミフでどう Assert したらいいのか……．並行に動いてる感は味わえた．
        // 20191225 同期していい感じに大きくなっているのを確認．
        // Assert.assertEquals(2, operandStr.countStr("oge"));
    }
}