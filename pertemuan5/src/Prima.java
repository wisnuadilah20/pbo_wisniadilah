import java.util.*;
public class Prima {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        for ( int i = 2; i <=20; i++) {
            int pembagi = 0;
            for ( int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    pembagi++;
                }
            }
            if (pembagi == 2) {
                System.out.print (i + ",");
            }
        }
    }
    
}
