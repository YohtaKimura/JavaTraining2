package ch12.ex01;

final class ObjectNotFoundException extends Exception {
    private final Object object;
    public final String message;

    public ObjectNotFoundException(final Object object) {
        this.object = object;
        message = "No such object" + object.toString() + "in this list";
    }

public ObjectNotFoundException(final Object object, Throwable cause) {
        super(cause);
        this.object = object;
        message = "No such object" + object.toString() + "in this list";
    }
    public Object getObject() {
        return object;
    }
}

