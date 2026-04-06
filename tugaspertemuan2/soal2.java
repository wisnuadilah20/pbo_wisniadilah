import java.util.Scanner;

public class soal2{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        double r;
        double luas, keliling;
        final double phi = 3.14;

        System.out.print("Masukkan Nilai Radius : ");
        r = input.nextDouble();

        luas = phi * r * r;
        keliling = 2 * phi * r;

        System.out.println("Hasil Perhitungan : ");
        System.out.println("Luas Lingkaran : " + luas);
        System.out.println("Keliling Lingkaran : " + keliling);

        input.close();
   

       
    }
}