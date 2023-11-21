import java.util.*;
public class Minno {
    public static void main(String[] args) {
        int[]arr={1,2,4,6,-9,8,9};
        System.out.println(min(arr));
    }
    static int min(int[]arr){
        int ans=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<ans){
                ans=arr[i];
                return ans;
            }


        }
        return -1;
    }
}
