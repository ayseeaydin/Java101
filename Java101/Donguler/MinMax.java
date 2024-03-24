// MIN MAX DEĞERLERİ BULMA
package java101;

import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları 
        // bulan ve bu sayıları ekrana yazan programı yazın. 
    
        System.out.print("kac tane sayi gireceksiniz= ");
        int girilecekSayi= input.nextInt();
    
        System.out.print("1. sayiyi giriniz= ");
        int ilkSayi=input.nextInt();
        
        int enBuyuk=ilkSayi;
        int enKucuk=ilkSayi;
        
        for(int i=2; i<=girilecekSayi;i++){
            System.out.print(i+". sayiyi giriniz= ");
            int sayi=input.nextInt();
            
            if(sayi>enBuyuk){
                enBuyuk=sayi;
            }
            
            if(sayi<enKucuk){
                enKucuk=sayi;
            }
        }
        
        System.out.println("En buyuk sayi= "+enBuyuk);
        System.out.println("En kucuk sayi= "+enKucuk);
    }
}
