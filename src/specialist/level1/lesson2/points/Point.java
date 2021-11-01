package specialist.level1.lesson2.points;

public class Point {
    private int x;
    private int y;
    private double length;
    private static int pointsCounter;
    private final int pointID;


    static {
        System.out.println("Static block!!!");
    }

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        setX(x);
        setY(y);
        pointID = pointsCounter++;
    }

    public final void setY(int y) {
        this.y = y;
        length();
    }

    public final void setX(int x) {
        this.x = x;
        length();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getLength() {
        return length;
    }

    public static int getPointsCounter() {
        return pointsCounter;
    }

    public double distanceTo(Point rValue){
        return Math.sqrt((this.x - rValue.x)*(this.x - rValue.x)
        + (this.y - rValue.y)*(this.y-rValue.y));
    }

    public Point addTo(Point rValue){
        return new Point(this.x+rValue.x, this.y + rValue.y);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(x);
        sb.append(", ");
        sb.append(y);
        sb.append(")");
        return sb.toString();
    }

    public void length() {
        length = Math.sqrt(x * x + y * y);
    }
}
