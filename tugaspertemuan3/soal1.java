import java.util.Scanner;
public class soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nama;
        double nilai1, nilai2, nilai3, rataRata;
        String hadiah;

        System.out.println("PROGRAM HITUNG NILAI RATA-RATA");
        System.out.print("Nama Siswa  : ");
        nama = scanner.nextLine();
        System.out.print("Nilai Pertandingan 1 :");
        nilai1 = scanner.nextDouble();
        System.out.print("Nilai Pertandingan 2 :");
        nilai2 = scanner.nextDouble();
        System.out.print("Nilai Pertandingan 3 :");
        nilai3 = scanner.nextDouble();

        rataRata = (nilai1 + nilai2 + nilai3) /3;

        if (rataRata >= 85) {
            hadiah = "Seperangkat Komputer P4";
        }
        else if (rataRata >= 70){
            hadiah = "Uang Sebesar Rp. 500.000";
        }
        else {
            hadiah = "Hiburan";
        }

        System.out.println("-------Hasil-------");
        System.out.println("Siswa yang bernama " + nama);
        System.out.println("Nilai Rata-Rata: " + rataRata);
        System.out.println("Hadiah: " + hadiah);
    }
}
