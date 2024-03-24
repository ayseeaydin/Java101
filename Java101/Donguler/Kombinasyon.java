//KOMBİNASYON HESAPLAMA
package java101;

import java.util.Scanner;

public class Kombinasyon {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır.
        //N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
        //kombinasyon formülü;
        //C(n,r) = n! / (r! * (n-r)!)
        
        System.out.print("kumenin eleman sayisini giriniz= ");
        int eleman = input.nextInt();

        System.out.print("olusturulacak alt kumenin eleman sayisini giriniz= ");
        int kume = input.nextInt();

        int a = 1, n = 1, r = 1;

        for (int i = 1; i <= eleman; i++) {
            n *= i;
        }
        for (int i = 1; i <= kume; i++) {
            r *= i;
        }
        for (int i = 1; i <= (eleman - kume); i++) {
            a *= i;
        }

        int kombinasyon = n / (r * a);
        System.out.println("kombinasyon= " + kombinasyon);
    }
}
