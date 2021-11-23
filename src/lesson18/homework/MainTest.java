package lesson18.homework;

import java.util.Arrays;

public class MainTest {
    public static void main(String[] args) throws CustomException {
        StringUtilsImpl stringUtilsImpl = new StringUtilsImpl();



        System.out.println(stringUtilsImpl.div("2","1"));
        System.out.println(stringUtilsImpl.div("2","0"));
        System.out.println(stringUtilsImpl.div(null,"2"));
        System.out.println(stringUtilsImpl.div("dsfdsf","2"));

        int[] mass = stringUtilsImpl.findWord("this is a word a text word","word");

        System.out.println(Arrays.toString(mass));

        double[] doubles = stringUtilsImpl.findNumbers("ldfgfdgkfdlgfdgk4.5gkjdfkgjfdk3.4dsfjdskfjd1.2");
        System.out.println(Arrays.toString(doubles));

        double[]  noDoublesInText = stringUtilsImpl.findNumbers("ggfdkgjfdkg");
        System.out.println(Arrays.toString(noDoublesInText));

    }
}
