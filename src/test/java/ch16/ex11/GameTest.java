package ch16.ex11;

import org.junit.Test;

public class GameTest {
    @Test
    public void test() throws IllegalAccessException, ClassNotFoundException, InstantiationException {
        String[] arg = new String[1];
        arg[0] = "Human";
        Game.main(arg);
    }

}