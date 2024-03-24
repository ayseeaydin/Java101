//bir sayının basamak sayılarının toplamını hesaplayan programı yazınız
//örnek: 1643=1+6+4+3=14
package java101;

import java.util.Scanner;

public class BasamakToplami {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("lutfen bir sayi giriniz: ");
        int sayi = input.nextInt();

        int basamakDegeri;
        int toplam = 0;

        while (sayi != 0) {
            basamakDegeri = sayi % 10;
            toplam += basamakDegeri;
            sayi /= 10;
        }

        System.out.println("girdiginiz sayinin basamak degerleri toplami= " + toplam);

    }
}
