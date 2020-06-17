package ch16.ex11;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class PlayerLoader extends ClassLoader {
    @Override
    public Class<?> findClass(String name) throws ClassNotFoundException {
    	name = getClass().getPackage().getName() + "." + name;
	    byte[] b = loadClassData(name);
	    return defineClass(name, b, 0, b.length);
    }

    private byte[] loadClassData(String name) throws ClassNotFoundException {
	  try (	FileInputStream in = new FileInputStream(new File(name))) {
	       int length = in.available();
	       if (length == 0) throw new ClassNotFoundException(name);
           byte[] buf = new byte[length];
           in.read(buf);
           return buf;
      } catch (IOException e) {
	  return null;
	  }
    }
}
