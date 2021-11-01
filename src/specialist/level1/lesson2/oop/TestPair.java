package specialist.level1.lesson2.oop;

public class TestPair extends Test {
    private int y;

    public TestPair(int y, int x) {
        super(x);
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return
                super.toString() + " y=" + y;
    }
}
