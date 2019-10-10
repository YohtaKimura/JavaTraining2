package ch03.ex07;

class Attr {
    private String name;
    private Object value = null;

    public Attr(final String name) {
        this.name = name;
    }

    public Attr(final String name, final Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }

    public Object setValue(final Object newValue) {
        Object oldVal = value;
        value = newValue;
        return oldVal;
    }

    @Override
    public String toString() {
        return name + "='" + value + "'";
    }
}
