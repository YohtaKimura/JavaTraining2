package ch10.ex02;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

class StringInJava {
    public static String convertSpecialCharacter(final String input) {
        StringBuilder convertedString = new StringBuilder();
        Character[] charArray = ArrayUtils.toObject(input.toCharArray());
        Arrays.stream(charArray).forEach(convertedString::append);
        return convertedString.toString();
    }

    private String replace(final char c) {
        switch (c) {
            // ただ書き直しただけ……．元もテスト書けていないのでとりあえずはテストなし．
            case '\n': return "\\n";
            case '\t': return "\\t";
            case '\b': return "\\b";
            case '\r': return "\\r";
            case '\f': return "\\f";
            case '\\': return "\\\\";
            case '\'': return "\\'";
            case '\"': return "\\\"";
            default: break;
        }
        return String.valueOf(c);
    }
}
