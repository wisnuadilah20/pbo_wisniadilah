import java.util.Scanner;
public class soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String nama;
       double nilaiKeaktifan, nilaiTugas, nilaiUjian;
       double nilaiMurniKeaktifan, nilaiMurniTugas, nilaiMurniUjian, nilaiAkhir;
       char grade;

       System.out.println("PROGRAM HITUNG NILAI AKHIR");
       System.out.print("Nama Siswa  : ");
       nama = scanner.nextLine();
       System.out.print("Nilai Keaktifan :");
       nilaiKeaktifan = scanner.nextDouble();
       System.out.print("Nilai Tugas :");
       nilaiTugas = scanner.nextDouble();
       System.out.println("Nilai Ujian :");
       nilaiUjian = scanner.nextDouble();

       nilaiMurniKeaktifan = nilaiKeaktifan * 0.20;
       nilaiMurniTugas = nilaiTugas * 0.30;
       nilaiMurniUjian = nilaiUjian * 0.50;
       nilaiAkhir = nilaiMurniKeaktifan + nilaiMurniTugas + nilaiMurniUjian;

       if (nilaiAkhir >=80){
        grade = 'A';
       }
       else if (nilaiAkhir >= 70){
        grade = 'B';
       }
       else if (nilaiAkhir >= 59){
        grade = 'C';
       }
       else if (nilaiAkhir >=50){
        grade = 'D';
       }
       else {
        grade = 'E';
       }
       
       System.out.println("-------Hasil-------");
       System.out.println("Siswa yang bernama " + nama);
       System.out.println("Dengan nilai persentasi yang dihasilkan : ");
       System.out.println("Nilai Keaktifan * 0.20: " + nilaiMurniKeaktifan);
       System.out.println("Nilai Tugas * 0.30: " + nilaiMurniTugas);
       System.out.println("Nilai Ujian * 0.50: " + nilaiMurniUjian);
       System.out.println("Nilai Akhir: " + nilaiAkhir);
       System.out.println("Jadi Siswa yang bernama: " + nama + "Memperoleh nilai akhir sebesar:"
        + nilaiAkhir + "Grade nilai yang didapat adalah :" + grade
        );

    }
    
}
