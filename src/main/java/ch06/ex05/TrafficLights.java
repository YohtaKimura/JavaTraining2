package ch06.ex05;

enum TrafficLights {
    GREEN("GREEN") {
        @Override
        public String getColor() {
            return this.getRawColor() + ". Let's go.";
        }
    },
    YELLOW("YELLOW") {
        @Override
        public String getColor() {
            return this.getRawColor() + ". Stop, if you can.";
        }
    },
    RED("RED") {
        @Override
        public String getColor() {
            return this.getRawColor() + ". Stop.";
        }
    };

    private final String color;
    
    private TrafficLights(final String color) {
        this.color = color;
    }

    abstract public String getColor();

    protected String getRawColor(){
        return this.color;
    };
}
