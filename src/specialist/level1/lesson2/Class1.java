package specialist.level1.lesson2;

public class Class1 {
    public static void main(String[] args) {
        TestClass1 test = new TestClass1();
        test.setX(100);
        System.out.println(test.getX());
    }
}

class TestClass1{
    private int x;

    public int getX(){
        return x;
    }

    public void setX(int x){
        if(x<0){
            x = -x;
        }
        this.x = x;
    }
}
