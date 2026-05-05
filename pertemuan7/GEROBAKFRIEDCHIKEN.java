import java.util.Scanner;

import com.ibm.security.jgss.mech.krb5.s;
public class GEROBAKFRIEDCHIKEN {
    Scanner input = new Scanner (System.in);
    String[] kode = new String[100];
    String[] jenis = new String[100];
    int[] harga = new int[100];
    int[] banyak = new int[100];
    int[] jumlah = new int[100];
    int banyakJenis;


    System.out.println( "GEROBAK FRIED CHIKEN ");
    System.out.println("------------------------");
    System.out.println(" Kode   Jenis   Harga ");
    System.out.println(" D  Dada  2500 ");
    System.out.println(" P  Paha  2000 ");
    System.out.println(" S  Sayap  1500 ");

    System.out.print("Banyak Jenis : ");
    banyakJenis = input.nextInt();

    for (int i = 0; i < banyakJenis; i++) {
        System.out.print("Kode : ");
        kode[i] = input.next();
        System.out.print("Banyak : ");
        banyak[i] = input.nextInt();

        if (kode[i].equalsIgnoreCase("D")) {
            jenis[i] = "Dada";
            harga[i] = 2500;
        } else if (kode[i].equalsIgnoreCase("P")) {
            jenis[i] = "Paha";
            harga[i] = 2000;
        } else if (kode[i].equalsIgnoreCase("S")) {
            jenis[i] = "Sayap";
            harga[i] = 1500;
        } else {
            System.out.println("Kode tidak valid");
            continue;
        }
        jumlah[i] = harga[i] * banyak[i];
    }
    


    
}
