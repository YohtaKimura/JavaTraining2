package ch03.ex02;

public class XInserted {
    {
        System.out.printf("This is in XInserted initializer.I cannot find neither xMask nor fullMask\n");
    }

    protected int xMask = 0x00ff;
    protected int fullMask;

    public XInserted() {
        System.out.printf("This is in XInserted constructor xMask: %s, fullMask: %s\n", xMask, fullMask);
        fullMask = xMask;
        System.out.printf("This is in XInserted constructor xMask: %s, fullMask: %s\n", xMask, fullMask);
  }

  public int mask(int orig) {
        return (orig & fullMask);
  }
}
