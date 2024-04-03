//RECURSİVE METOTLAR İLE USLU SAYI HESAPLAMA
//Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak yapan programı yazınız.

package java101;

import java.util.Scanner;

public class RecursiveUsluSayi {

    static int power(int i, int x){
        if(x==0){
            return 1;  // üs 0 olursa sonuç taban ne olursa olsun 1 olur
        }
        else return i*power(i, x-1);
    }
    
    
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        
        System.out.print("Taban degerini giriniz= ");
        int taban=scan.nextInt();
        
        System.out.print("Us degerini giriniz= ");
        int us=scan.nextInt();
        
        System.out.println("Sonuc= "+ power(taban, us));
      
    }
    
}
