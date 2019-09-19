package ch01.ex14;

import org.junit.Test;

public class Walkman2TerminalTest {
    @Test
    public void play() throws Exception {
        Walkman w = new Walkman2Terminal();
        w.setData("music");
        // 目視確認
        w.play();
    }
}