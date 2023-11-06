import java.util.*;
public class Max {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a,b values:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        //int c=sc.nextInt();
//        int max = a;
//        if(b > max)
//        {
//max = b;
//        }
//        if(c > max)
//        {
//            max = c;
//        }
//        int max=0;
//        if(a>b)
//        {
//            max=a;
//        }
//        else {
//            max=b;
//        }
        int max = Math.max(a,b);
        System.out.println(max);
    }
}
