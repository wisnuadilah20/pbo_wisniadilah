public class NestedFor2 {
    public static void main(String[] args) throws Exception {
        for (int a = 5; a >= 1; a--) {
            for (int b = a; b <= 5; b++) {
                System.out.print(" " + b);
            }
            System.out.println();
        }
    }
    
     // no 1
        int tinggi = 5;

        for (int a = 1; a <= tinggi; a++) {
            for (int b = 1; b <= tinggi - a; b++) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= (2 * a - 1); k++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    } 
    // no 2
       int tinggi = 7;

        for (int a = 1; a <= tinggi; a++) {
            for (int b = 1; b <= tinggi; b++) {
                if (a == b || a + b == tinggi + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    // no 3
    int tinggi = 7;

        for (int a = tinggi; a >= 1; a--) {
           
            for (int b = 1; b <= tinggi - a; b++) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= (2 * a - 1); k++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    // no 4
     public static void main(String[] args) {
        int tinggi = 7;

        for (int a = 1; a <= tinggi; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
            
            for (int a = tinggi - 1; a >= 1; a--) {
                for (int b = 1; b <= a; b++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    // no 5
        int tinggi = 7;

    
        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= tinggi - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    
        for (int i = tinggi - 1; i >= 1; i--) {
            for (int j = 1; j <= tinggi - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
            }
    
    





