// java ch20.ex05.FindLines bbbb ch20/ex05/input.txt
package ch20.ex05;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class FindLines {
    public static void main(String[] args) {
        FileReader fileIn;
        LineNumberReader in;
        try {
            fileIn = new FileReader(args[1]);
            in = new LineNumberReader(fileIn);
        } catch (FileNotFoundException e1) {
            System.out.println("File not found: " + e1.getMessage());
            return;
        }
        String line;
        try {
            while ((line = in.readLine()) != null)
                if (line.contains(args[0]))
                    System.out.printf("%3d: %s%n", in.getLineNumber(), line);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
