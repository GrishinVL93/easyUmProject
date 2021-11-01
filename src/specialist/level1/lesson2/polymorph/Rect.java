package specialist.level1.lesson2.polymorph;

public class Rect extends Shape {
    private int a,b;

    public Rect(int x, int y, String name, int a, int b) {
        super(x, y, name);
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return super.toString() +
                " a=" + a +
                ", b=" + b;
    }

    public double area(){
        return a*b;
    }


}
