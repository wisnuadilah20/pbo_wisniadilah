import java.util.Scanner;

public class arrayID {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     
        //int[] bilangan = {1,2,3,4,5};
        int[]nilai = new int[5];
        int a;
        
        for ( a=0; a < 4; a++){
            System.out.println("Masukkan nilai index- " + a + " : ");
            nilai[a] = input.nextInt();
        }
        for (a=0; a < 4; a++){
            System.out.println("Nilai index- " + a + " : " +nilai[a]);
        }



    }
}