package uz.staticForMe.modul;

public class Point {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public double getY(int i) {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void printXY () {
        System.out.println("(" + x + "; " + y + ")");
    }
}
