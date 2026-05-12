import java.util.Scanner;
 
public class NilaiAkhirSiswa {
    public static void main(String[] args) {
 
        // Deklarasi Variabel
        Scanner  input            = new Scanner(System.in);
        int      jumlahMahasiswa  = 0;        // jumlah mahasiswa yang diinput
        int      i                = 0;        // counter loop input
        int      j                = 0;        // counter loop output
        String   ulang            = "";       // pilihan pengulangan program (Y/T)
 
        // Array data mahasiswa (maks 100 orang)
        String[] namaMahasiswa    = new String[100]; // nama tiap mahasiswa
        double[] nilaiTugas       = new double[100]; // nilai tugas asli
        double[] nilaiUTS         = new double[100]; // nilai UTS asli
        double[] nilaiUAS         = new double[100]; // nilai UAS asli
        double[] nilaiMurniTugas  = new double[100]; // tugas  x 30%
        double[] nilaiMurniUTS    = new double[100]; // UTS    x 30%
        double[] nilaiMurniUAS    = new double[100]; // UAS    x 40%
        double[] nilaiAkhir       = new double[100]; // total nilai akhir
        String[] grade            = new String[100]; // grade A-E
        // ============================================
 
        do {
            // Layar Masukan
            System.out.println("PROGRAM HITUNG NILAI AKHIR MATAKULIAH PBO UNDIRA");
            System.out.print("Masukkan Jumlah Mahasiswa : ");
            jumlahMahasiswa = input.nextInt();
            input.nextLine();
            System.out.println();
 
            // Input Data Mahasiswa
            i = 0;
            while (i < jumlahMahasiswa) {
                System.out.println("Mahasiswa Ke - " + (i + 1));
                System.out.print("Nama Mahasiswa : ");
                namaMahasiswa[i] = input.nextLine();
 
                System.out.print("Nilai Tugas    : ");
                nilaiTugas[i]    = input.nextDouble();
 
                System.out.print("Nilai UTS      : ");
                nilaiUTS[i]      = input.nextDouble();
 
                System.out.print("Nilai UAS      : ");
                nilaiUAS[i]      = input.nextDouble();
                input.nextLine();
                System.out.println();
 
                // Proses Hitung Nilai Murni dan Nilai Akhir
                nilaiMurniTugas[i] = nilaiTugas[i] * 0.30;
                nilaiMurniUTS[i]   = nilaiUTS[i]   * 0.30;
                nilaiMurniUAS[i]   = nilaiUAS[i]   * 0.40;
                nilaiAkhir[i]      = nilaiMurniTugas[i] + nilaiMurniUTS[i] + nilaiMurniUAS[i];
 
                // Proses Penentuan Grade
                if (nilaiAkhir[i] >= 80) {
                    grade[i] = "A";
                } else if (nilaiAkhir[i] >= 70) {
                    grade[i] = "B";
                } else if (nilaiAkhir[i] >= 59) {
                    grade[i] = "C";
                } else if (nilaiAkhir[i] >= 50) {
                    grade[i] = "D";
                } else {
                    grade[i] = "E";
                }
 
                i++;
            }
 
            // Layar Keluaran
            System.out.println("=============================================================");
            System.out.println("                      DAFTAR NILAI                           ");
            System.out.println("                MATERI : PEMROGRAMAN PBO                     ");
            System.out.println("=============================================================");
            System.out.println("No. | Nama Mahasiswa     |              Nilai          | Grade");
            System.out.println("---------------------------------------------------------------");
            System.out.println("    |                    | Tugas | UTS  | UAS  | Akhir |      ");
            System.out.println("-------------------------|-------|------|------|-------|-------");
 
            j = 0;
            while (j < jumlahMahasiswa) {
                System.out.printf("%-3d | %-18s | %-5.1f | %-4.1f | %-4.1f | %-5.2f | %s%n",
                        (j + 1),
                        namaMahasiswa[j],
                        nilaiTugas[j],
                        nilaiUTS[j],
                        nilaiUAS[j],
                        nilaiAkhir[j],
                        grade[j]);
                j++;
            }
 
            System.out.println("-------------------------------------------------------------");
 
            // Loop Tanya Ulang
            System.out.println();
            System.out.print("Apakah ingin menghitung ulang? (Y/T) : ");
            ulang = input.nextLine();
            System.out.println();
 
        } while (ulang.equals("Y") || ulang.equals("y"));
 
        System.out.println("Terima kasih telah menggunakan program ini!");
        input.close();
    }
}