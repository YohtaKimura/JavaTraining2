package ch01.ex01

import org.junit.Assert
import org.junit.Test

public class HelloWorldTest {
    @Test
    public void name() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        HelloWorld.print(new PrintStream(out));
        String s = out.toString();
        Assert.assertEquals("Hello", s);
    }
}