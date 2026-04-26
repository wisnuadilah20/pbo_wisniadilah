import java.util.*;

public class Genap {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int a, total = 0;
        for ( a = 2; a<= 20; a +=2) {
            System.out.print(a + "+");
            total = total + a;
        }
        System.out.print(" = " + total);
    }
}
