package ch21.ex02;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;

public class DataHandlerTest {
    @Test
    public void Test() throws Exception {
        File file = new File("src/main/java/ch21/ex01/input.txt");
        final DataHandler dataHandler = new DataHandler();
        dataHandler.readFile(file);
        file = null;
        System.gc();
        assertEquals(null, dataHandler.readFile(new File("src/main/java/ch21/ex01/input.txt")));
    }
}