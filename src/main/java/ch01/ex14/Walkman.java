package ch01.ex14;

public class Walkman {
    private String data;

    protected Walkman() {}

    public void setData(String data) {
        this.data = data;
    }

    public void play() {
        System.out.println(data);
    }

    public void deleteData() {
        this.data = null;
    }

    protected String getData() {
        return this.data;
    }
}
