import java.util.*;
public class prime{

    public static void main(String args[]){
        int num=6;
        //int trigger=1;
        for(int c=2;c<num;c++)
        {
            if(num%c==0)
            {
                System.out.println("not prime");
                return;
            }
            else {
                System.out.println("prime");
                return;
            }

        }

    }
}
