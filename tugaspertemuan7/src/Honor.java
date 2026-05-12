import java.util.Scanner;

public class Honor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double HONOR_TETAP = 700000;
        final double LEMBUR_PER_JAM = 2500;

        int jumlahKaryawan;
        double totalGaji = 0;

        System.out.println("==============================================");
        System.out.println("Program Hitung Honor Karyawan Kontrak PT. EASY");
        System.out.println("==============================================");

        System.out.print("Masukkan Jumlah Karyawan : ");
        jumlahKaryawan = input.nextInt();

        System.out.println("\nPT. EASY");
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.printf("%-3s %-15s %-12s %-12s %-10s %-12s %-12s %-12s\n",
                "No", "Nama", "T.Jabatan", "T.Pendidikan",
                "Lembur", "Honor", "Pajak", "G.Bersih");
        System.out.println("---------------------------------------------------------------------------------------------");

        for (int i = 1; i <= jumlahKaryawan; i++) {

            input.nextLine(); // membersihkan buffer

            System.out.println("\nKaryawan Ke - " + i);

            System.out.print("Nama Karyawan : ");
            String nama = input.nextLine();

            System.out.print("Golongan (1/2/3) : ");
            int golongan = input.nextInt();

            System.out.print("Pendidikan (1=SMU / 2=D3 / 3=S1) : ");
            int pendidikan = input.nextInt();

            System.out.print("Jumlah Jam Kerja : ");
            int jamKerja = input.nextInt();

            // Tunjangan Jabatan
            double persenJabatan = 0;

            switch (golongan) {
                case 1:
                    persenJabatan = 0.05;
                    break;
                case 2:
                    persenJabatan = 0.10;
                    break;
                case 3:
                    persenJabatan = 0.15;
                    break;
            }

            // Tunjangan Pendidikan
            double persenPendidikan = 0;

            switch (pendidikan) {
                case 1:
                    persenPendidikan = 0.025;
                    break;
                case 2:
                    persenPendidikan = 0.05;
                    break;
                case 3:
                    persenPendidikan = 0.075;
                    break;
            }

            double tunjanganJabatan = persenJabatan * HONOR_TETAP;
            double tunjanganPendidikan = persenPendidikan * HONOR_TETAP;

            // Lembur
            int jamLembur = 0;

            if (jamKerja > 240) {
                jamLembur = jamKerja - 240;
            }

            double honorLembur = jamLembur * LEMBUR_PER_JAM;

            // Total honor
            double honor = HONOR_TETAP + tunjanganJabatan
                    + tunjanganPendidikan + honorLembur;

            // Pajak 5%
            double pajak = 0.05 * honor;

            // Gaji bersih
            double gajiBersih = honor - pajak;

            totalGaji += gajiBersih;

            // Output tabel
            System.out.printf("%-3d %-15s %-12.0f %-12.0f %-10.0f %-12.0f %-12.0f %-12.0f\n",
                    i, nama, tunjanganJabatan, tunjanganPendidikan,
                    honorLembur, honor, pajak, gajiBersih);
        }

        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.printf("Total Gaji yang dikeluarkan Rp. %.0f\n", totalGaji);

        input.close();
    }
}