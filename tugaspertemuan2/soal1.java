import java.util.Scanner;

public class soal1{
    public static void main (String[] args){
        double celcius, fahrenheit, reamor;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai Derajat Celcius : ");
        celcius = input.nextDouble();
        fahrenheit = (9.0/5.0 * celcius) + 32;
        reamor =(4.0/5.0) * celcius;

        System.out.println("Hasil Konversi  : ");
        System.out.println("Derajat Fahrenheit  : " + fahrenheit);
        System.out.println("Derajat Reamor  : " + reamor);

        input.close();

    }
}