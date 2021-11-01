package lesson7.geometry;

public class Circle extends Ellipse{

    protected double r;

    public Circle(double r) {
        super(r,r);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * r * r;
    }
}
