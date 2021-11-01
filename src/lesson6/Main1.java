package lesson6;

public class Main1 {
    public static void main(String[] args) {
        Tour tour1 = new Tour();
        tour1.setCost(10000);
        tour1.setCountry("Россия");
        tour1.setDays(4);
        tour1.setStars(2);
        tour1.setTypeOfHotel("Полупансион");
        tour1.setTypeOfVehicle("Самолет");

        //Создание объектов математических фигур и присваивание начальных значений через сеттеры

        Circle c1 = new Circle();
        c1.setR(5);
        System.out.println(c1.area());

        Ellipse e1 = new Ellipse();
        e1.setoA(5);
        e1.setoB(10);
        System.out.println(e1.area());

        Rectangle rectangle1 = new Rectangle();
        rectangle1.setA(4);
        rectangle1.setB(5);
        System.out.println(rectangle1.area());

        Triangle triangle1 = new Triangle();
        triangle1.setA(3);
        triangle1.setB(4);
        triangle1.setC(5);
        System.out.println(triangle1.area());

    }
}
