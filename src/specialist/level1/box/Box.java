package specialist.level1.box;

import java.util.Comparator;

public class Box implements Comparable<Box> {
    private int a, b, c;

    public Box(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public int compareTo(Box rValue) {
        return volume() - rValue.volume();
    }

    @Override
    public String toString() {
        return "Box{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public int volume(){
        return a * b * c;
    }

    //1 вариант Inner Class(Внутренний)
    /*public class CompareByA implements Comparator<Box> {

        @Override
        public int compare(Box b1, Box b2) {
            return b1.a - b2.a;
        }
    }*/

    public static class CompareByA implements Comparator<Box> {

        @Override
        public int compare(Box b1, Box b2) {
            return b1.a - b2.a;
        }
    }

    public int getA() {
        return a;
    }

    //3 Использование локального класса
    /*public static Comparator<Box> compareByA(){
        class CMP implements Comparator<Box>{
            @Override
            public int compare(Box o1, Box o2) {
                return o1.a - o2.a;
            }
        }
        return new CMP();
    }*/

    //4 Использование анонимного локального класса (анонимный класс может наследовать один интерфейс\класс)

    public static Comparator<Box> compareByA(){
        return new Comparator<Box>() {
            @Override
            public int compare(Box o1, Box o2) {
                return o1.a - o2.a;
            }
        };
    }
}
