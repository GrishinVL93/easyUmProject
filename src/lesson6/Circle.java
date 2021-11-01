package lesson6;

public class Circle {
    private double r;

    public double area(){
        return Math.PI * r * r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }


}
