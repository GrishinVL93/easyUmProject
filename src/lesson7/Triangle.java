package lesson7;

public class Triangle {
    private int a;
    private int b;
    private int c;

    public void initSides(int a, int b, int c) throws IncorrectSideException {

        if(a<=0 || b<=0 || c<=0){
            throw new IncorrectSideException("a<=0 || b<=0 || c<=0");
        }

        if(b+c <=a){
            throw new IncorrectSideException("Слишком большая сторона А");
        }

        if(a+b <= c){
            throw new IncorrectSideException("Слишком большая сторона С");
        }

        if(a+c <=b){
            throw new IncorrectSideException("Слишком большая сторона B");
        }

        this.a = a;
        this.b = b;
        this.c = c;

    }
}
