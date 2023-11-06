import com.sun.source.util.SourcePositions;

import java.util.*;
public class Fibo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter x value:");
        int x=sc.nextInt();
        int count=2;
        int a=0;
        int b=1;
        System.out.println(a);
        while(count<=x) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println(b);
        }
}
