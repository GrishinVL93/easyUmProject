package lesson6;

public class Ellipse {
    private int oA;
    private int oB;

    public double area(){
        return Math.PI *  oA * oB;
    }
    public int getoA() {
        return oA;
    }

    public void setoA(int oA) {
        this.oA = oA;
    }

    public int getoB() {
        return oB;
    }

    public void setoB(int oB) {
        this.oB = oB;
    }
}
