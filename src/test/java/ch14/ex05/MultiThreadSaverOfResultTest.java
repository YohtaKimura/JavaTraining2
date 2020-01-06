package ch14.ex05;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiThreadSaverOfResultTest {
    @Test
    public void countCharTest() throws Exception {
        final MultiThreadSaverOfResult multiThreadSaverOfResult = new MultiThreadSaverOfResult();
        multiThreadSaverOfResult.start();
        multiThreadSaverOfResult.print();
        // 20200106 なんかうまくいっていない……．isLocked とかを使って無理やり実現．微妙．
    }
}