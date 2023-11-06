import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
//        for (int i = arr.length-1; i >=0; i--) {
//           System.out.print((arr[i]));
        //System.out.println(" ");
//            for(int[] a :arr){
//                System.out.println(a);
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}

