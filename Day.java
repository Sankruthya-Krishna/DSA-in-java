import java.util.*;
public class Day {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter student number and name ");
        int rollno = sc.nextInt();
        String name = sc.next();
        switch (rollno) {
            case 1:
                System.out.println("1");
                switch (name) {
                    case "honey":
                        System.out.println("student name is honey");
                    case "cse":
                        System.out.println("cse branch");
                        break;
                }
           case 2:
                System.out.println("no.is 2");
                switch(name){
                    case "mintu":
                        System.out.println("name is mintu");
                    case "cse":
                        System.out.println("cse branch");
                        break;
                }

//            case 3:
//                System.out.println("wednesday");
//                break;
//
           default:
                System.out.println("invalid roll no");
                break;
                }


        }
    }

