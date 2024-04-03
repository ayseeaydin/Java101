//DESENE GÖRE METOT OLUŞTURMA
/*
Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.
Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. 
Her çıkarma işlemi sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. 
Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
örnek çıktı:
    25 20 15 10 5 0 5 10 15 20 25
*/

package java101;

import java.util.Scanner;

public class RecursiveDesen{
    
    public static void recursive(int n){
        System.out.print(n+" ");
        
        if(n<=0){
            System.out.print(n +" ");
            return;
        }
        
        recursive(n-5);
        System.out.print(n+" ");
    }
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Bir sayi giriniz= ");
        int sayi=in.nextInt();
        
        recursive(sayi);
    }
    
}

    
