package lesson7.geometry;

public class Ellipse extends Shape {

    private double rMin;
    private double rMax;

    public Ellipse(double rMin, double rMax) {
        this.rMin = rMin;
        this.rMax = rMax;
    }

    public double area(){
        return Math.PI * rMin * rMax;
    }
    public double getRMin() {
        return rMin;
    }

    public void setRMin(double rMin) {
        this.rMin = rMin;
    }

    public double getRMax() {
        return rMax;
    }

    public void setRMax(double rMax) {
        this.rMax = rMax;
    }
}
