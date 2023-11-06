import java.util.*;
public class Maxno {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 3, 1};
        int max=nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]>max){
                max=nums[i];
            }
        }
        System.out.println(max);
    }

}
