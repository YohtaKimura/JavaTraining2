package ch04.ex03;

interface ILinkedList {

    public void addFirst(final Object data);

    public void addLast(final Object data);

    public Object getData(int index) throws Exception;

    public int getSize();
}
