package ch10.ex01;

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
        if (c == '\n') {
            return "\\n";
        }
        if (c == '\t') {
            return "\\t";
        }
        if (c == '\b') {
            return "\\b";
        }
        if (c == '\r') {
            return "\\r";
        }
        if (c == '\f') {
            return "\\f";
        }
        if (c == '\\') {
            return "\\\\";
        }
        if (c == '\'') {
            return "\\'";
        }
        if (c == '\"') {
            return "\\\"";
        }
        return String.valueOf(c);
    }
}
