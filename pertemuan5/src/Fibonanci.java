import java.util.*;
public class Fibonanci {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int a = 1, b = 1;
        System.out.print(a + "," + b);
        for (int i = 1; i <= 6; i++) {
            int c = a + b;
            System.out.print("," + c);
            a = b;
            b = c;
        }
    }
}
    

