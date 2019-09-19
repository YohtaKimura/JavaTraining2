package ch01.ex15;

import java.util.HashMap;
import java.util.Map;

public class SimpleLookupOperation implements LookupOperation {
    private Map<String, Object> store = new HashMap<>();

    public Object find(String name) {
        return store.get(name);
    }

    public void add(String name, Object obj) {
        store.put(name, obj);
    }

    public void remove(String name) {
        store.remove(name);
    }
}
