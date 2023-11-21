import java.util.*;
public class Linear2D {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,6,88},
                {8,9,56,76}
        };
        int target=6;
       int[] ans= Search(arr,target);
        System.out.print("target found at index value ");
        System.out.println(Arrays.toString(ans));
        System.out.print("the max value is ");
        System.out.println(Max(arr));
        System.out.print("the min value is ");
        System.out.println(Min(arr));
    }
    static int[] Search(int[][]arr,int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]==target){
                    return new int[]{row ,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int Max(int[][]arr){
        int max=Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]>max){
                    max=arr[row][col];
                }
            }
        }
        return max;
    }
    static int Min(int[][]arr){
        int min=Integer.MAX_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]<min){
                    min=arr[row][col];
                }
            }
        }
        return min;
    }
}
