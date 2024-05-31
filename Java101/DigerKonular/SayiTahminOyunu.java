package java101;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class SayiTahminOyunu {

    public static void main(String[] args) {
        
        /*Java dilinde programın 0-100 arasında rastgele seçtiği bir sayıyı kullanıcının
        tahmin etmesini istediğiniz bir "Sayı Tahmin Oyunu" yapınız.*/
        
      Scanner input= new Scanner(System.in);
      Random rand= new Random();
      
      int sayi=rand.nextInt(100); // parantez içine yazacağım sayı ve 0 ile arasında bir sayı üretir
      System.out.println(sayi);
      
      int kalanHak=0;
      int tahmin; 
      int[] tahminler= new int[5];
      boolean kazandiMi=false;
      boolean hata=false;
      
      while(kalanHak<5){
          System.out.print("Lutfen tahmininizi giriniz: ");
          tahmin=input.nextInt();
          
          if(tahmin<0 || tahmin>99){
              System.out.println("Lutfen 0-100 arasinda bir sayi giriniz!");
              if(!hata){
                  hata=true;
                  System.out.println("Bir dahaki hatali girisinizde tahmin hakkinizdan dusulecektir!");
              }
              else{
                  kalanHak++;
                  System.out.println("Cok fazla hatali giris yaptiniz! Kalan hak: "+(5-kalanHak));
              }
              continue;
          }
          
          if(tahmin==sayi){
              System.out.println("Tebrikler, dogru tahmin! Gizli sayi: "+sayi);
              kazandiMi=true;
              break;
          }
          else{              
              System.out.println("Hatali bir sayi girdiniz! ");
              if(tahmin>sayi){
                  System.out.println(tahmin+" sayisi gizli sayidan buyuktur!");
              }
              else{
                  System.out.println(tahmin+" sayisi gizli sayidan kucuktur!");
              }
              tahminler[kalanHak]=tahmin;
              kalanHak++;
              System.out.println("Kalan hakkiniz: "+(5-kalanHak));
          }                           
      }
        
      if(!kazandiMi){
          System.out.println("Kaybettiniz!");
          System.out.println("Tahminleriniz: "+Arrays.toString(tahminler));
          System.out.println("Gizli sayi: "+ sayi);
      }
      
    }
}
