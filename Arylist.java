
import java.util.*;
public class Arylist {
    public static void main(String[] args) {
       ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 5 elements");

        for (int i = 0; i < 3; i++) {
           list.add(new ArrayList<>());
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());

            }
        }
        System.out.println(list);

//        list.add(5);
//        list.add(67);
//        list.add(66);
//        list.add(50);
//        list.add(56);
//        list.add(55);
//        list.add(53);
//        System.out.println(list);
//        list.set(2,4);
//        System.out.println(list);
//        list.remove(0);
//        System.out.println(list);


    }
}
