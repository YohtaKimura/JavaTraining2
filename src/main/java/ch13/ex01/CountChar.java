package ch13.ex01;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

final class CountChar{
    static long countChar(final String str, final char c) {
        final Character[] charArray = ArrayUtils.toObject(str.toCharArray());
        final Character wrappedC = Character.valueOf(c);
        return Arrays.stream(charArray).filter(wrappedC::equals).count();
   }
}
