//FAKTORİYEL HESAPLAYAN PROGRAM
package java101;

import java.util.Scanner;

public class Faktoriyel {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int faktoriyel = 1;
        System.out.print("lutfen bir sayi giriniz: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            faktoriyel *= i;
        }

        System.out.println(n + " sayisinin faktoriyeli= " + faktoriyel);

    }
}
