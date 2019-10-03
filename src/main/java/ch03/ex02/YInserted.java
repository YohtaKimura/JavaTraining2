package ch03.ex02;

class YInserted extends XInserted {
    {
        System.out.printf("This is in YInserted static initializer xMask: %s, fullMask: %s. I cannot find yMask\n", xMask, fullMask);
    }
    protected int yMask = 0xff00;

    public static void main(String[] args) {
        YInserted y = new YInserted();
    }

    public YInserted()
    {
        System.out.printf("This is in YInserted constructor xMask: %s, fullMask: %s, yMask: %s\n", xMask, fullMask, yMask);
        fullMask = yMask;
        System.out.printf("This is in YInserted constructor xMask: %s, fullMask: %s, yMask: %s\n", xMask, fullMask, yMask);
        System.out.println("I can refer super class field. xMask: " + super.xMask);
    }
}
