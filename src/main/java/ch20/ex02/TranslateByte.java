package ch20.ex02;

import java.io.IOException;
import java.io.StringReader;

public class TranslateByte {
    public static void main(String[] args) {
        if (args.length == 0)
            args = new String[] { "b", "B", "C" };

        StringReader in = new StringReader(args[0]);
        TranslateFilterReader reader = new TranslateFilterReader(in, (byte) args[1].charAt(0), (byte) args[2].charAt(0));
        int c;
        try {
            while ((c = reader.read()) != -1)
                System.out.print((char) c);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
