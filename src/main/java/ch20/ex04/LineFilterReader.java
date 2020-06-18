package ch20.ex04;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;

class LineFilterReader extends FilterReader {
    private static final char BR = System.getProperty("line.separator").charAt(0);

    protected LineFilterReader(Reader in) {
        super(in);
    }

    public void readLine() throws IOException {
        int c;
        StringBuilder sb = new StringBuilder();
        try {
            while ((c = read()) != -1) {
                sb.append((char) c);
                if (c == BR) {
                    System.out.println(sb);
                    sb.setLength(0);
                }
            }
            System.out.println(sb);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
