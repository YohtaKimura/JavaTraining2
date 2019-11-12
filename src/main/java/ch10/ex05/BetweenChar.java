package ch10.ex05;

class BetweenChar {
    public static String getBetweenChars(char start, char end) {
        if (start > end) {
            char temp = start;
            start = end;
            end = temp;
        }
        StringBuilder result = new StringBuilder();
        for (char c = start; c <= end; c++)
            result.append(String.valueOf(c));
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(BetweenChar.getBetweenChars('0', 'z'));
        System.out.println(BetweenChar.getBetweenChars('お', 'あ'));
        System.out.println(BetweenChar.getBetweenChars('一', '三'));
    }
}
