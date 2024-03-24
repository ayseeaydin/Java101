// ARMSTRONG SAYI BULMA
// java döngüler ile sayının armstrong sayı olup olmadığını bulan programı yazıyoruz
//N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.
//Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir. Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.
//1342 sayısına da bakalım. (1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354 sayısı 1342’ye eşit olmadığı için armstrong sayı olmaz.
package java101;

import java.util.Scanner;

public class ArmstrongSayi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int toplam = 0;
        int basamakSayisi = 0;
        int sonBasamak;
        System.out.print("lutfen bir sayi giriniz= ");
        int sayi = input.nextInt();

        int temp = sayi;
        //girilen sayinin basamak sayisini bulma islemi:
        while (temp != 0) {
            temp /= 10;
            basamakSayisi++;
        }
        System.out.println("girdiginiz sayi " + basamakSayisi + " basamaklidir..");

        //girilen sayinin son basamaginin(basamak degerini) ne oldugunu bulma islemi:
        temp = sayi;
        while (temp != 0) {
            sonBasamak = temp % 10;
            System.out.println("sayinin basamak degeri= " + sonBasamak);

            int basamakUssu = 1;
            for (int i = 1; i <= basamakSayisi; i++) {
                basamakUssu *= sonBasamak;
            }
            toplam += basamakUssu;
            temp /= 10;
        }
        System.out.println("toplam= " + toplam);

        if (toplam == sayi) {
            System.out.println("girdiginiz sayi armstrong bir sayidir..");
        } else {
            System.out.println("girdiginiz sayi armstrong bir sayi degildir..");
        }

    }
}
