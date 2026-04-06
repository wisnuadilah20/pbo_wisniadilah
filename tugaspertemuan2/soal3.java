import java.util.Scanner;
public class soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String namaSiswa;
        double nilaiUts,nilaiUas, nilaiTugas;
        double murniUts, murniUas, murniTugas, nilaiAkhir;

        System.out.print("Masukkan Nama Siswa : ");
        namaSiswa = input.nextLine();
        System.out.print(" Nilai UTS : ");
        nilaiUts = input.nextDouble();
        System.out.print(" Nilai UAS : ");
        nilaiUas = input.nextDouble();
        System.out.print(" Nilai Tugas Mandiri: ");
        nilaiTugas = input.nextDouble();

        murniUts = nilaiUts * 0.35;
        murniUas = nilaiUas * 0.40;
        murniTugas = nilaiTugas * 0.20;

        nilaiAkhir = murniUts + murniUas + murniTugas;

        System.out.println("Hasil Perhitungan : ");
        System.out.println("Nama Siswa : " + namaSiswa);
        System.out.println("Nilai Murni UTS : " + murniUts);
        System.out.println("Nilai Murni UAS : " + murniUas);
        System.out.println("Nilai Murni Tugas : " + murniTugas);
        System.out.println("Nilai Akhir yang diperoleh yaitu  : " + nilaiAkhir);

        input.close();


    }
}
