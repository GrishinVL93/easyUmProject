package lesson3;

public class Main5 {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6};
        int [] newarr = new int[6];

        for(int i = 0; i< array.length;i++){
            newarr[i] = array[array.length-1-i];
        }

        for(int i: newarr){
            System.out.println(i);
        }
    }
}
