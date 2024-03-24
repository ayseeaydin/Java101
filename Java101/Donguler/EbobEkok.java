// EBOB EKOK BULAN PROGRAM
package java101;

import java.util.Scanner;

public class EbobEkok {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayiyi giriniz= ");
        int sayi1 = input.nextInt();

        System.out.print("Ikinci sayiyi giriniz= ");
        int sayi2 = input.nextInt();

        int kucukSayi, buyukSayi, ebob = 0, ekok = 0;

        if (sayi1 < sayi2) {
            kucukSayi = sayi1;
            buyukSayi = sayi2;
        } else {
            kucukSayi = sayi2;
            buyukSayi = sayi1;
        }

        // EBOB BULMA \\  
        // Bu döngü doğru ama bu algoritmayla yaparsam döngü birçok kez döneceği için kod benim için ekonomik olmaz
//        for(int i=1; i<=kucukSayi; i++){
//            if(kucukSayi%i==0 && buyukSayi%i==0 ){
//                ebob=i;
//            }
//        }
//        System.out.println(sayi1+" ve "+sayi2+" sayilarinin ebobu= "+ebob);
        //Bu yazacağım döngü daha kullanışlı benim için. En büyük sayıdan başlayacağı için ilk ortak bölene geldiğinde EBOBU zaten bulmuş olurum
        for (int i = kucukSayi; i >= 1; i--) {
            if (kucukSayi % i == 0 && buyukSayi % i == 0) {
                ebob = i;
                System.out.println(sayi1 + " ve " + sayi2 + " sayilarinin ebobu= " + ebob);
                break;
            }
        }

        // EKOK BULMA \\
        // EKOK = (n1*n2) / EBOB
        for (int j = 1; j <= kucukSayi * buyukSayi; j++) {
            if (j % kucukSayi == 0 && j % buyukSayi == 0) {
                ekok = j;
                break;
            }
        }
        System.out.println(sayi1 + " ve " + sayi2 + " sayilarinin ekoku= " + ekok);
    }
}
