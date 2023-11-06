import java.util.*;
public class Swap {
    public static void main(String[] args) {
        int[]arr={1,2,3,4};
      swap(arr, 0,1);
        System.out.println(Arrays.toString(arr));
    }
   public static void swap(int[]arr,int ind0,int ind1){
        int temp=arr[ind0];
       arr[ind0]=arr[ind1];
        arr[ind1]=temp;

    }
}
