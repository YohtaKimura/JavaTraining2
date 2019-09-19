package ch01.ex16;

import java.io.FileInputStream;
import java.io.IOException;

public class MyUtilities {
    public double [] getDataSet(String setName)
    throws BadDataSetException
    {
        String file = setName + ".dset";
        FileInputStream in = null;
        try {
            in = new FileInputStream(file);
            return new double[] {0.0,0.1};
        } catch (IOException e) {
            throw new BadDataSetException("file not found");
        } finally {
            try {
                if (in != null)
                    in.close();
            } catch (IOException e) {
                ;
            }
        }
    }
}
