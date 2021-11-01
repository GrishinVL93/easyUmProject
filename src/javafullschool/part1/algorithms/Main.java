package javafullschool.part1.algorithms;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();


        int[] mass = {2,4,1,5,6,9,8};

        bubbleSort(mass);

        for(int i: mass){
            System.out.println(i);
        }
    }

    private static int linearSearch(List<String> list, String arg){
        for(int i = 0; i < list.size();i++){
            if(list.get(i).equals(arg)){
                return i;
            }
        }
        return -1;
    }

    private static void bubbleSort(int[] arr){
        for(int i = arr.length-1;i>0;i--){
            for(int j = 0; j<i;j++){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
}
