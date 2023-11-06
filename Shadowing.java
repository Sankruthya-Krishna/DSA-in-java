import java.sql.SQLOutput;

public class Shadowing {
    static int x=40;
    public static void main(String[] args) {
        System.out.println(x);
        int x=76;
        System.out.println(x);
        devi();
    }

    public static void devi() {
        System.out.println(x);

    }
}
