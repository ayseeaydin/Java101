//İKİNİN KUVVETLERİ
//Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.
package java101;

import java.util.Scanner;

public class Java101 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("bir sayi giriniz: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i *= 2) {
            System.out.println(i);
        }

    }
}
