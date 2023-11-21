import java.util.*;
public class Aryqstn {
    public static void main(String[] args) {
        int[] nums = {12, 122,3456, 1345};
        System.out.println(Findnum(nums));
       // System.out.println(digit2(123456));
    }
//    static int digit2(int num){
//        return (int) (Math.log10(num))+1;

//    }
    static int Findnum(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (Even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean Even(int num) {
        int no_of_Digits=Digit(num);
            return no_of_Digits % 2 == 0;

       // return false;
    }

    static int Digit(int num) {
        int count = 0;
//        while (num > 0) {
//            num = num / 10;
//            count++;
//        }
        return (int) (Math.log10(num))+1;
    }
}
