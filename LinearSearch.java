import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
      //  *********************************************************
        //int[]arr = {1, 2, 3, 4, 5, 8, 77, 65, 98, 67};
////        Scanner sc=new Scanner(System.in);
////        System.out.println("enter array elements:");
////        int[] arr=sc.next();
       //int target = 3;
//        //System.out.println(Linear(arr, target));
//        //System.out.println(Linear(arr, target));
//        Linear(arr, target);
     //   ************************************************************
        String name="honey";
        int[]arr = {1, 2, 3, 4, 5, 8, 77, 65, 98, 67};
        int target = 3;
        char search='e';
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(Arrays.toString(arr));
        System.out.println(Search(arr,target,1,4,name,search));
        //Search(arr,target);
    }
    //*******************************************************************
    public static boolean Search(int[]arr,int start,int end,int target,String name,char search){
        if(name.length()==0){
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i)==search){
                return true;
            }
        }
       // return false;
//    static void Linear(int[] arr, int target) {
//        // {
        if (arr.length == 0) {
            System.out.println("element not found");
            return false;
        }
        //else(arr[i] == target){
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == target) {
                System.out.print("element found at index no:");
                System.out.println(j);
                return true;
                //System.out.println(j);
            }
        }
//        System.out.println("not exists");
//
//        }
        return false;
}
}
    //********************************************************************************8








