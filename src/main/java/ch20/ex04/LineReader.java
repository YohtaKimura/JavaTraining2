package ch20.ex04;

import java.io.IOException;
import java.io.StringReader;

public class LineReader {
    public static void main(String[] args) {
        StringReader sr = new StringReader("12345\nABC");
        LineFilterReader reader = new LineFilterReader(sr);
        try {
            reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}