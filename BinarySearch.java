import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        //int[] arr={-3,-5,0,6,8,9};
        int[] arr={9,8,7,5,3};
        Scanner sc= new Scanner(System.in);
        System.out.println("enter target element");
        int target=sc.nextInt();
        int ans=Search(arr,target);
        System.out.print("found at index no:");
        System.out.println(ans);
    }
    static int Search(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        if(arr[start]<arr[end]) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
                else {
                    return mid;
                }
            }
        }
        else {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target > arr[mid]) {
                    end = mid - 1;

                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
                else {
                    return mid;
                }
            }
        }

        return-1;
    }
}
//CEILING:the smallest number which is equal or >r then target
//FLOOR: the biggest number which is equal or < then target
