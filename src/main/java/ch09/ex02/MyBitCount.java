package ch09.ex02;

class MyBitCount {
    public static int bitCount(int i) {
        //return Integer.toBinaryString(i).replace("0","").length();
        // TODO: add test
        int cnt = 0;
        for (int mask = 1; mask != 0; mask <<=1) {
            if ((i & mask) != 0){
                cnt++;
            }
        }
        return 0;
    }
}
