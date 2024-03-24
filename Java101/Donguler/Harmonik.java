//HARMONİK SAYILARI BULAN PROGRAM

import java.util.Scanner;

public class Harmonik {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Java ile girilen sayının harmonik serisini bulan program yazınız.
        // 1 + 1/2 + 1/3 + 1/n
        
        System.out.print("bir sayi giriniz= ");
        int sayi = input.nextInt();

        float harmonik = 0;

        for (float i = 1; i <= sayi; i++) {
            harmonik += 1 / i;
        }
        System.out.println("sonuc= " + harmonik);
    }
}
