package ch13.ex02;

final class CountString {
    private final String operandStr;

    private CountString(final String targetStr) {
        this.operandStr = targetStr;
    }

    static CountString of(final String operandStr) {
        return new CountString(operandStr);
    }

    public int countStr(final String str) {
        int cnt = 0;
            for (int start = 0; start < operandStr.length(); start++){
                int index = operandStr.indexOf(str, start);
                if (index == -1) {
                    break;
                }
                cnt++;
                start = index;
            }
        return cnt;
   }
}
