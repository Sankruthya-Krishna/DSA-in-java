
import java.sql.SQLOutput;
import java.util.*;
import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
//        int[] nums = {2, 3, 4};
//        System.out.println(Arrays.toString(nums));
//        Change(nums);
//        System.out.println(Arrays.toString(nums));
//    }
//    static  void Change(int[] arr ){
//        arr[0]=99;
//    }
//}
    Scanner sc = new Scanner(System.in);
//        String[] str = new String[5];
//        for (int i = 0; i < str.length; i++) {
//            str[i]=sc.next();
//        }
//        System.out.println(Arrays.toString(str));
//        str[2] = "honey";
//        System.out.println(Arrays.toString(str));
       // int[][] arr = new int[3][3];
        int[][] arr={
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                //arr[row][col] = sc.nextInt();
//            }
//        }
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col]);
//            }
//            System.out.println(" ");
//        }
        for (int[]a:arr){
            System.out.println(Arrays.toString(a));
        }
    }

}



