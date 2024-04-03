//RECURSİVE METOTLAR İLE ASAL SAYI BULMA
package java101;

import java.util.Scanner;
import static java101.Java101.isAsal;

public class AsalRecursive {

    static int isAsal(int sayi, int bolen) {
        if (bolen == 1) {
            return 1;
        } 
        if (sayi < 2) {
            return 0;  //en küçük asal sayı 2'dir. 2'den küçük asal sayı olamaz
        }
        if (sayi % bolen == 0) {
            return 0; //sayı herhangi bir sayıya bölümünden kalan 0 ise o sayı zaten asal değildir
        }
        return isAsal(sayi, bolen - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("lutfen bir sayi giriniz= ");
        int sayi = in.nextInt();

        int sonuc=isAsal(sayi, sayi / 2);  // bolen sayiyi sayinin yarisi giriyorum
        //çünkü sayının yarısına kadar hiçbir sayıya bölünmezse o sayı zaten asaldır
        
        if(sonuc==1){
            System.out.println(sayi+" sayisi asal bir sayidir");
        }
        else{
            System.out.println(sayi+" sayisi asal bir sayi degildir");
        }
            
        }
}
