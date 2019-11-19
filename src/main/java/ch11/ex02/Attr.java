package ch11.ex02;

class Attr<E> {
    private String name;
    private E value = null;

    public Attr(final String name) {
        this.name = name;
    }

    public Attr(final String name, final E value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }

    public Object setValue(final E newValue) {
        Object oldVal = value;
        value = newValue;
        return oldVal;
    }

    @Override
    public String toString() {
        return name + "='" + value + "'";
    }
}
