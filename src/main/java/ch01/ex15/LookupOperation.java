package ch01.ex15;

public interface LookupOperation extends Lookup {
    public void add(String name, Object obj);
    public void remove(String name);
}
