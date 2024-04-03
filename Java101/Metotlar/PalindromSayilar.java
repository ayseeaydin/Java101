// PALİNDROM SAYILAR

/*Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program yapıyoruz.

Palindrom Sayı Nedir ?
Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.

Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....  */


package java101;

public class PalindromSayilar {

    static boolean isPalindrom(int sayi) {
        int temp = sayi, tersSayi = 0, sonSayi;
        while (temp != 0) {
            System.out.println("-------------");
            System.out.println("sayi= " + temp);
            sonSayi = temp % 10;
            System.out.println("son basamak= " + sonSayi);
            tersSayi = (tersSayi * 10) + sonSayi;
            System.out.println("yeni sayi= " + tersSayi);
            temp /= 10;
        }

        if (sayi == tersSayi) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(303));
    }

}
