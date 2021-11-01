package specialist.level1.box;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Box[] boxes = {
                new Box(10,1,1),
                new Box(1,10,10),
                new Box(2,2,2),
        };

        Arrays.sort(boxes); // volume()

        for(Box box: boxes){
            System.out.println(box);
        }

        //1 способ решения задачи через построение внутренного класса(сортируем по стороне а)
        /*Box.CompareByA cmp = new Box(0,0,0).new CompareByA();
        Arrays.sort(boxes,cmp);*/

        //2 способ решения задачи через внутренний статический класс
        /*Arrays.sort(boxes, new Box.CompareByA());*/


        //3 и 4 способ решения задачи через вызов статического метода с локальным классом + анонимным классом
        /*Arrays.sort(boxes,Box.compareByA());*/

        //5 cпособ объявление анонимного класса в вызове метода
        /*Arrays.sort(boxes, new Comparator<Box>() {
            @Override
            public int compare(Box o1, Box o2) {
                return o1.getA() - o2.getA();
            }
        });*/
        //6 способ лямбда выражения
        Arrays.sort(boxes, (o1, o2) -> o1.getA() - o2.getA());

        for(Box b: boxes){
            System.out.println(b);
        }



    }
}
