package ch21.ex07;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
// Stack is ArrayList かといわれると違うかなと思うのでサブクラスにはしない方がいいと思いました．スタックはランダムアクセスできないですし．
public class ArrayListStack<E> {
    private List<E> list = new ArrayList<>();

    public E push(E element) {
        list.add(element);
        return element;
    }

    public E pop() {
        if (list.isEmpty())
            throw new EmptyStackException();
        return list.remove(list.size() - 1);
    }

    public int search(E element) {
        return list.indexOf(element);
    }
}
