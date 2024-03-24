//YILDIZLAR İLE ELMAS YAPIMI
package java101;

import java.util.Scanner;

public class YildizlarIleElmas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("lutfen satir sayisin giriniz= ");
        int sayi = input.nextInt();

        for (int i = 1; i <= sayi; i++) {

            for (int j = 1; j <= sayi - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int a = sayi - 1; a > 0; a--) {

            for (int b = 1; b <= sayi - a; b++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= (2 * a - 1); c++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
