//TEK SAYILARIN TOPLAMI
package java101;

import java.util.Scanner;

public class TekSayilarintoplami {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        //Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden 
        //ve girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.
        
        int i;
        int toplam = 0;

        do {
            System.out.print("lutfen bir sayi giriniz: ");
            i = input.nextInt();

            if (i % 2 == 1) {
                System.out.println("tek sayi= " + i);
                toplam += i;
            }

        } while (i > 0);

        System.out.println("girdiginiz tek sayilarin toplami= " + toplam);
         */
        
        //Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden 
        //ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
        
        int i;
        int toplam = 0;

        do {
            System.out.print("lutfen bir sayi giriniz: ");
            i = input.nextInt();

            if (i % 4 == 0) {
                System.out.println(i+" sayisi 4 un kati..");
                toplam += i;
            }
        } while (i % 2 != 1);

        System.out.println("4 un kati olan sayilarin toplami=  " + toplam);

    }
}
