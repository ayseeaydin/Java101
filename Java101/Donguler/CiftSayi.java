//Girilen Sayıya Kadar Olan Çift Sayıları Bulan Program
package java101;

import java.util.Scanner;

public class Java101 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int k;
        System.out.print("lutfen bir sayi giriniz: ");
        k = input.nextInt();

        /*
        //kullanicinin girdigi sayiya kadar olan cift sayilari goruntuleyen programi yaziyoruz
        for (int i = 1; i <= k; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
         */
        
        //ÖDEV:Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
        int toplam = 0;
        int sayac = 0;

        for (int i = 0; i <= k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println(i);
                toplam += i;
                sayac++;      // sayac ile kac tane sayi kullandigimi hesapliyorum buna gore ortalama alacagim            
            }
        }
        double ortalama = toplam / sayac;
        System.out.println("sayilarin ortalamasi= " + ortalama);

    }
}
