import java.util.Scanner;

public class BeratBadanIdeal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        // Deklarasi Variabel;
        String jenisKelamin     = "";
        int tinggiBadan         = 0;
        int beratIdeal          = 0;
        int beratSebenarnya     = 0;
        int selisih             = 0;
        String ulang            = "";

        do {
            // Input Jenis Kelamin
            System.out.print("Pilih Jenis Kelamin (L/P) : ");
            jenisKelamin = input.nextLine();

            // Input Tinggi Badan
            System.out.print("Masukkan Tinggi Badan Anda (dalam cm) : ");
            tinggiBadan = input.nextInt();
            input.nextLine();

            // Hitung Berat Badan Ideal
            if (jenisKelamin.equals("L")) {
                beratIdeal = tinggiBadan - 100;
            } else if (jenisKelamin.equals("P")) {
                beratIdeal = tinggiBadan - 110;
            } 
            System.out.println("Berat Badan Ideal Anda : " + beratIdeal + " kg");

            // Input Berat Badan Sebenarnya
            System.out.print("Masukkan Berat Badan Anda (dalam kg) : ");
            beratSebenarnya = input.nextInt();
            input.nextLine();

            // Hitung Selisih & Tampilkan Hasil
            selisih = beratSebenarnya - beratIdeal;
            if (beratSebenarnya == beratIdeal) {
                System.out.println(" Selamat Berat Badan Anda Sudah Ideal");
            } else if (beratSebenarnya < beratIdeal) {
                System.out.println("Anda termasuk kedalam kategori kurus dan harus menambah berat ");
                System.out.println("badan sebanyak " + (beratIdeal - beratSebenarnya)
                        + " Kg (" + beratIdeal + " Kg - " + beratSebenarnya + " Kg)");
            } else {
                System.out.println("Anda termasuk kedalam kategori gemuk dan harus mengurangi berat ");
                 System.out.println("badan sebanyak " + selisih
                        + " Kg (" + beratSebenarnya + " Kg - " + beratIdeal + " Kg)");
            }

            // Loop Tanya Ulang
            System.out.print("Apakah anda ingin menghitung Ulang? (Y/T) : ");
            ulang = input.nextLine();
            System.out.println();
        } while (ulang.equals("Y") || ulang.equals("y"));
        System.out.println("Terima Kasih Telah Menggunakan Program Ini");
        input.close();


    }
}
