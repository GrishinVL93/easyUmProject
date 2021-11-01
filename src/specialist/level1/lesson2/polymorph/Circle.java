package specialist.level1.lesson2.polymorph;

public class Circle extends Shape {
    private int r;

    public Circle(int x, int y, String name, int r) {
        super(x, y, name);
        this.r = r;
    }

    @Override
    public String toString() {
        return super.toString() +
                "r=" + r;
    }

    public double area(){
        return Math.PI * r * r;
    }
}
