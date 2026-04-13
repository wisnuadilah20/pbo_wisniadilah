import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char kodeSusu;
        int kodeUkuran;
        String namaSusu = "", ukuran = "";
        int harga = 0;
        int jumlah, total;

        // Tampilan Menu
        System.out.println("TOKO KELONTONG KERONCONGAN");
        System.out.println("--------------------------");
        System.out.println("A. Susu Dancow");
        System.out.println("1. Ukuran Kecil");
        System.out.println("2. Ukuran Sedang");
        System.out.println("3. Ukuran Besar");
        System.out.println("B. Susu Bendera");
        System.out.println("1. Ukuran Kecil");
        System.out.println("2. Ukuran Sedang");
        System.out.println("3. Ukuran Besar");
        System.out.println("C. Susu SGM");
        System.out.println("1. Ukuran Kecil");
        System.out.println("2. Ukuran Sedang");
        System.out.println("3. Ukuran Besar");

        // Input
        System.out.print("\nMasukkan Merk Susu [Dancow|Bendera|SGM] : ");
        kodeSusu = input.next().charAt(0);

        System.out.print("Masukkan Ukuran Kaleng [Kecil|Sedang|Besar] : ");
        kodeUkuran = input.nextInt();

        // Proses
        switch (kodeSusu) {
            case 'A':
                namaSusu = "Dancow";
                switch (kodeUkuran) {
                    case 1: ukuran = "Kecil"; harga = 25000; break;
                    case 2: ukuran = "Sedang"; harga = 20000; break;
                    case 3: ukuran = "Besar"; harga = 15000; break;
                    default: System.out.println("Ukuran tidak valid!"); input.close(); return;
                }
                break;

            case 'B':
                namaSusu = "Bendera";
                switch (kodeUkuran) {
                    case 1: ukuran = "Kecil"; harga = 20000; break;
                    case 2: ukuran = "Sedang"; harga = 17500; break;
                    case 3: ukuran = "Besar"; harga = 13500; break;
                    default: System.out.println("Ukuran tidak valid!"); input.close(); return;
                }
                break;

            case 'C':
                namaSusu = "SGM";
                switch (kodeUkuran) {
                    case 1: ukuran = "Kecil"; harga = 22000; break;
                    case 2: ukuran = "Sedang"; harga = 18500; break;
                    case 3: ukuran = "Besar"; harga = 15000; break;
                    default: System.out.println("Ukuran tidak valid!"); input.close(); return;
                }
                break;

            default:
                System.out.println("Kode susu tidak valid!");
                input.close();
                return;
        }

        // Output detail (biar tidak warning)
        System.out.println("\nMerk Susu : " + namaSusu);
        System.out.println("Ukuran    : " + ukuran);
        System.out.println("Harga Satuan Barang Rp. " + harga);

        // Input jumlah
        System.out.print("Jumlah Yang dibeli : ");
        jumlah = input.nextInt();

        // Hitung total
        total = harga * jumlah;

        // Output akhir
        System.out.println("Harga Yang Harus dibayar Sebesar Rp. " + total);

        // Tutup scanner (hilangkan resource leak)
        input.close();
    }
}