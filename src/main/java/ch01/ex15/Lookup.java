package ch01.ex15;

public interface Lookup {
    /** name と関連付けされた値を返す．
     * そのような値がなければ null を返す．
     */
    Object find(String name);
}
