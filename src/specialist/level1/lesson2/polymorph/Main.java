package specialist.level1.lesson2.polymorph;

public class Main {
    public static void main(String[] args) {

        Rect r1 = new Rect(4,4,"Name",5,6);
        Circle c1 = new Circle(4,5,"circle",4);

        Shape[] shapes = {
                r1,c1, new Rect(1,4,"name2",4,5)
        };

        for (Shape shape: shapes) {
            System.out.println(shape);
        }

      //  printAreas(shapes);
    }
    private static void printAreas(Shape[] shapes){
        for(Shape shape : shapes){
            if(shape instanceof  Rect){
                System.out.println(((Rect) shape).area());
            }
            else if(shape instanceof Circle){
                System.out.println(((Circle) shape).area());
            }
        }
    }
}
