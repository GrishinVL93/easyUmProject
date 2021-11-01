package lesson7.geometry;

public class Cone extends Circle {

    private double h;

    public Cone(double r, double h) {
        super(r);
        this.h = h;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double volume() {
        return (1.0 / 3) * super.area() * h;
    }

    @Override
    public double area() {
        double l = r*r + h*h;
        return Math.PI * r * r + Math.PI * r * l;
    }
}
