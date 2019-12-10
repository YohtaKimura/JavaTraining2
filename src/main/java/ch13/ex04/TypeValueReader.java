package ch13.ex04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

final class TypeValueReader {
    private static final String PKG_PREFIX = "java.lang.";

    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Input [type value] ");
            String type, value;
            if (scanner.hasNext())
                type = scanner.next();
            else
                break;
            if (type.equals("END") || type.equals("end") || type.equals("End"))
                break;
            if (scanner.hasNext())
                value = scanner.next();
            else
                break;
            if (!type.startsWith(PKG_PREFIX))
                type = PKG_PREFIX + type;
            try {
                Class<?> c = Class.forName(type);
                Constructor<?> constructor = c.getConstructor(String.class);
                list.add(constructor.newInstance(value));
            } catch (ClassNotFoundException | InstantiationException
                    | IllegalAccessException | NoSuchMethodException
                    | SecurityException | IllegalArgumentException
                    | InvocationTargetException e) {
                System.err.println("ERROR: " + e.getClass().getName());
                continue;
            }
        }
        scanner.close();
        for (Object o : list)
            System.out.println(o);
    }
}
