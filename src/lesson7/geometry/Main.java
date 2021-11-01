package lesson7.geometry;


public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(4,5);
        System.out.println("rectangle area :" + rectangle.area());

        Square square = new Square(5);
        System.out.println("square area : " + square.area());

        Triangle triangle = new Triangle(3,4,5);
        System.out.println("triangle area : " + triangle.area());

        Circle circle = new Circle(6);
        System.out.println("circle area : " + circle.area());

        Cone cone = new Cone(1,3);
        System.out.println("cone volume : " + cone.volume());
        System.out.println("cone area : " + cone.area());

        Ellipse ellipse = new Ellipse(6,7);
        System.out.println("ellipse area : " + ellipse.area());



    }
}
