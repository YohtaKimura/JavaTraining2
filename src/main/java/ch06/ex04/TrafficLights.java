package ch06.ex04;

enum TrafficLights {
    GREEN("GREEN"),
    YELLOW("YELLOW"),
    RED("RED");

    private final String color;

    private TrafficLights(final String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
}
