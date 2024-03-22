// BURÇ BULAN PROGRAM
// Burç bulan program
// Koç Burcu : 21 Mart - 20 Nisan
// Boğa Burcu : 21 Nisan - 21 Mayıs
// İkizler Burcu : 22 Mayıs - 22 Haziran
// Yengeç Burcu : 23 Haziran - 22 Temmuz
// Aslan Burcu : 23 Temmuz - 22 Ağustos
// Başak Burcu : 23 Ağustos - 22 Eylül
// Terazi Burcu : 23 Eylül - 22 Ekim
// Akrep Burcu : 23 Ekim - 21 Kasım
// Yay Burcu : 22 Kasım - 21 Aralık
// Oğlak Burcu : 22 Aralık - 21 Ocak
// Kova Burcu : 22 Ocak - 19 Şubat
// Balık Burcu : 20 Şubat - 20 Mart
package java101;

import java.util.Scanner;

public class Java101 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ay, gun;

        System.out.print("lutfen dogdugunuz ayi rakamla giriniz(1-12): ");
        ay = input.nextInt();
        System.out.print("lutfen dogdugunuz gunu giriniz(1-31): ");
        gun = input.nextInt();

        if (ay == 1) {
            if (gun >= 1 && gun <= 21) {
                System.out.println("dogum tarihiniz: " + gun + " ocak - burcunuz: Oglak");
            } else {
                System.out.println("dogum tarihiniz: " + gun + " ocak - burcunuz: Kova");
            }
        } else if (ay == 2) {
            if (gun >= 1 && gun <= 19) {
                System.out.println("dogum tarihiniz: " + gun + " subat - burcunuz: Kova");
            } else {
                System.out.println("dogum tarihiniz: " + gun + " ocak - burcunuz: Balik");
            }
        } else if (ay == 3) {
            if (gun >= 1 && gun <= 20) {
                System.out.println("dogum tarihiniz: " + gun + " mart - burcunuz: Balik");
            } else {
                System.out.println("dogum tarihiniz: " + gun + " mart - burcunuz: Koc");
            }
        } else if (ay == 4) {
            if (gun >= 1 && gun <= 20) {
                System.out.println("dogum tarihiniz: " + gun + " nisan - burcunuz: Koc");
            } else {
                System.out.println("dogum tarihiniz: " + gun + " nisan - burcunuz: Boga");
            }
        } else if (ay == 5) {
            if (gun >= 1 && gun <= 21) {
                System.out.println("dogum tarihiniz: " + gun + " mayis - burcunuz: Boga");
            } else {
                System.out.println("dogum tarihiniz: " + gun + " mayis - burcunuz: Ikizler");
            }
        } else if (ay == 6) {
            if (gun >= 1 && gun <= 22) {
                System.out.println("dogum tarihiniz: " + gun + " haziran - burcunuz: Ikizler");
            } else {
                System.out.println("dogum tarihiniz: " + gun + " haziran - burcunuz: Yengec");
            }
        } else if (ay == 7) {
            if (gun >= 1 && gun <= 22) {
                System.out.println("dogum tarihiniz: " + gun + " temmuz - burcunuz: Yengec");
            } else {
                System.out.println("dogum tarihiniz: " + gun + " temmuz - burcunuz: Aslan");
            }
        } else if (ay == 8) {
            if (gun >= 1 && gun <= 22) {
                System.out.println("dogum tarihiniz: " + gun + " agustos - burcunuz: Aslan");
            } else {
                System.out.println("dogum tarihiniz: " + gun + " agustos - burcunuz: Basak");
            }
        } else if (ay == 9) {
            if (gun >= 1 && gun <= 22) {
                System.out.println("dogum tarihiniz: " + gun + " eylul - burcunuz: Basak");
            } else {
                System.out.println("dogum tarihiniz: " + gun + " eylul - burcunuz: Terazi");
            }
        } else if (ay == 10) {
            if (gun >= 1 && gun <= 22) {
                System.out.println("dogum tarihiniz: " + gun + " ekim - burcunuz: Terazi");
            } else {
                System.out.println("dogum tarihiniz: " + gun + " ekim - burcunuz: Akrep");
            }
        } else if (ay == 11) {
            if (gun >= 1 && gun <= 21) {
                System.out.println("dogum tarihiniz: " + gun + " kasim - burcunuz: Akrep");
            } else {
                System.out.println("dogum tarihiniz: " + gun + " kasim - burcunuz: Yay");
            }
        } else if (ay == 12) {
            if (gun >= 1 && gun <= 21) {
                System.out.println("dogum tarihiniz: " + gun + " aralik - burcunuz: Yay");
            } else {
                System.out.println("dogum tarihiniz: " + gun + " aralik - burcunuz: Oglak");
            }
        }
    }
}
