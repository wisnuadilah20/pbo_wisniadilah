import java.util.Scanner;

public class GerobakFriedChicken {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] jenis = new String[100];
        int[] harga = new int[100];
        int[] banyakBeli = new int[100];
        int[] jumlahHarga = new int[100];

        int totalBayar = 0;

        System.out.println("GEROBAK FRIED CHICKEN");
        System.out.println("--------------------------------");
        System.out.println("Kode   Jenis      Harga");
        System.out.println("--------------------------------");
        System.out.println("D      Dada       Rp. 2500");
        System.out.println("P      Paha       Rp. 2000");
        System.out.println("S      Sayap      Rp. 1500");
        System.out.println("--------------------------------");

        System.out.print("\nBanyak Jenis : ");
        int banyakJenis = input.nextInt();

        for (int i = 0; i < banyakJenis; i++) {

            System.out.println("\nJenis Ke-" + (i + 1));

            System.out.print("Jenis Potong [D/P/S] : ");
            String kode = input.next();

            System.out.print("Banyak Potong        : ");
            banyakBeli[i] = input.nextInt();

            // Menentukan jenis dan harga
            if (kode.equals("D")) {
                jenis[i] = "Dada";
                harga[i] = 2500;

            } else if (kode.equals("P")) {
                jenis[i] = "Paha";
                harga[i] = 2000;

            } else if (kode.equals("S")) {
                jenis[i] = "Sayap";
                harga[i] = 1500;
            }

            jumlahHarga[i] = harga[i] * banyakBeli[i];
            totalBayar += jumlahHarga[i];
        }

        double pajak = totalBayar * 0.10;
        double totalAkhir = totalBayar + pajak;

        // Output
        System.out.println("\nGEROBAK FRIED CHICKEN");
        System.out.println("---------------------------------------------------");
        System.out.println("No  Jenis     Harga Satuan   Banyak Beli   Jumlah");
        System.out.println("---------------------------------------------------");

        for (int i = 0; i < banyakJenis; i++) {

            System.out.println(
                (i + 1) + "   " +
                jenis[i] + "\tRp." +
                harga[i] + "\t     " +
                banyakBeli[i] + "\t      Rp." +
                jumlahHarga[i]
            );
        }

        System.out.println("---------------------------------------------------");
        System.out.println("Jumlah Bayar : Rp. " + totalBayar);
        System.out.println("Pajak 10%    : Rp. " + pajak);
        System.out.println("Total Bayar  : Rp. " + totalAkhir);
    }
}