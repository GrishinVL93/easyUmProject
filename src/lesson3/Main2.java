package lesson3;

public class Main2 {
    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5,6,7,8,9};

        for(int i = 0;i<nums.length;i++){
            System.out.println(nums[nums.length-1-i]);
        }

        for(int i = 0;i<nums.length;i++){
            if(nums[nums.length-1-i] %2 != 0)
            System.out.println(nums[nums.length-1-i]);
        }

    }
}
