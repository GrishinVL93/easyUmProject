package lesson3;

public class Main4 {
    public static void main(String[] args) {
        int[] nums = new int[7];

        int values = 10;
        for(int i = 0; i< nums.length;i++){
            nums[i] = values;
            values+=2;
        }

        for (int i: nums){
            System.out.println(i);
        }
    }
}
