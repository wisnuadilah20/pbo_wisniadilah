import java.util.*;
public class Ganjil {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int a, total = 0;
        for ( a = 1; a<= 19; a +=2) {
            System.out.print(a + "+");
            total = total + a;
        }
        System.out.print(" = " + total);
    }
}
