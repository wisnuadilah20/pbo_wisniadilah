import java.util.Scanner;

public class NilaiAkhir {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] nama = new String[100];
        double[] tugas = new double[100];
        double[] uts = new double[100];
        double[] uas = new double[100];
        double[] nilaiAkhir = new double[100];
        String[] grade = new String[100];

        System.out.println("PROGRAM HITUNG NILAI AKHIR");
        System.out.println("MATERI PEMROGRAMMAN C++");

        System.out.print("\nMasukkan Jumlah Mahasiswa : ");
        int jumlah = input.nextInt();
        input.nextLine();

        // Input data mahasiswa
        for (int i = 0; i < jumlah; i++) {

            System.out.println("\nMahasiswa Ke - " + (i + 1));

            System.out.print("Nama Mahasiswa : ");
            nama[i] = input.nextLine();

            System.out.print("Nilai Tugas    : ");
            tugas[i] = input.nextDouble();

            System.out.print("Nilai UTS      : ");
            uts[i] = input.nextDouble();

            System.out.print("Nilai UAS      : ");
            uas[i] = input.nextDouble();
            input.nextLine();

            // Hitung nilai akhir
            nilaiAkhir[i] = (tugas[i] * 0.30) +
                             (uts[i] * 0.30) +
                             (uas[i] * 0.40);

            // Menentukan grade
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
        }

        // Output
        System.out.println("\nDAFTAR NILAI");
        System.out.println("MATERI : PEMROGRAMMAN C++");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("No\tNama\t\tTugas\tUTS\tUAS\tAkhir\tGrade");
        System.out.println("-------------------------------------------------------------------");

        for (int i = 0; i < jumlah; i++) {

            System.out.println(
                (i + 1) + "\t" +
                nama[i] + "\t\t" +
                tugas[i] + "\t" +
                uts[i] + "\t" +
                uas[i] + "\t" +
                nilaiAkhir[i] + "\t" +
                grade[i]
            );
        }

        System.out.println("-------------------------------------------------------------------");
    }
}
    

