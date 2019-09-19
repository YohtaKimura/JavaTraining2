package ch01.ex08;

public final class Point {
    public static void main(String[] args) {
        final Point origin = new Point();
        origin.setX(1.0);
        origin.setY(2.0);
        final Point another = new Point();
        another.copy(origin);
    }

    public double x, y;
    public Point(){
        this.x = 0.0;
        this.y = 0.0;
    };

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void copy(Point point){
        this.x = point.getX();
        this.y = point.getY();
    }

    public double getY() {
        return this.y;
    }

    public double getX() {
        return this.x;
    }
}
