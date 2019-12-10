package ch13.ex06;

import java.util.Objects;

final class CommaWriterByThreeDigits {
    public static String insertComma(final String source) {
        return insertComma(source, ',', 3);
    }

    public static String insertComma(String source, final char separator, final int interval) {
        if (Objects.isNull(source))
            throw new NullPointerException();
        if (interval < 1)
            throw new IllegalArgumentException();
        for (int count = 0, i = source.length() - 1; i > 0; i--)
            if (++count % interval == 0)
                source = source.substring(0, i) + separator + source.substring(i);
        return source;
    }
}
