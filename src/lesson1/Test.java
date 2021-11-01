package lesson1;

import java.io.Console;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};
        int[] copy = Arrays.copyOf(a,a.length*2);
        System.out.println(Arrays.toString(copy));
        Arrays.sort(a);
    }
}
