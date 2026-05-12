import java.util.Scanner;

public class AngkaTerbesar {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

       System.out.print("Masukkan jumlah angka: ");
       int a = input.nextInt();

       int[] angka = new int [a];

       for (int i = 0; i < a; i++) {
        System.out.print ("Masukkan angka ke-" + (i+1) + ": ");
        angka[i] = input.nextInt();

       }

       int terbesar = angka[0];

       for (int i = 1; i < a; i++) {
        if(angka[i] > terbesar) {
            terbesar = angka[i];
        }
       }
       System.out.println("Angka terbesar adalah: " + terbesar);
    }
}
