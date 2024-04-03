// GELİŞMİŞ HESAP MAKİNESİ
package java101;

import java.util.Scanner;

public class HesapMakinesi {
    
    static int toplama(int a, int b){
        int sonuc=a+b;
        System.out.println("Toplama isleminin sonucu= "+ sonuc);
        return sonuc;
    }
    
    static int cikarma(int a, int b){
        int sonuc=a-b;
        System.out.println("Cikarma isleminin sonucu= "+sonuc);
        return sonuc;
    }
    
    static int carpma(int a, int b){
        int sonuc=a*b;
        System.out.println("Carpma isleminin sonucu= "+sonuc);
        return sonuc;
    }
    
    static int bolme(int a, int b){
        if(b==0){
            System.out.println("Ikinci sayi sifirdan farkli olmali!");
            return 0;
        }
        int sonuc=a/b;
        System.out.println("Bolme isleminin sonucu= "+sonuc);
        return sonuc;
    }
    
    static int usAlma(int a, int b){
        int sonuc=1;
        for(int i=1;i<=b;i++){
            sonuc*=a;
        }
        System.out.println("Us alma isleminin sonucu= "+sonuc);
        return sonuc;
    }
    
    static int faktoriyel(int a){
        int sonuc=1;
        for(int i=1;i<=a;i++){
            sonuc*=i;
        }
        System.out.println("Faktoriyel alma isleminin sonucu= "+sonuc);
        return 1;
    }
    
    static int mod(int a, int b){
        int sonuc=a%b;
        System.out.println("Mod alma isleminin sonucu= "+sonuc);
        return sonuc;
    }
    
    static void dikdortgen(int a, int  b){
        System.out.println("Dikdortgenin cevresi= "+2*(a+b));
        System.out.println("Dikdortgenin alani= "+a*b);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int select;
        
        System.out.print("Lutfen iki sayi giriniz= ");
        int a=scan.nextInt();
        int b=scan.nextInt();

        String menu = "1-Toplama islemi\n"
                + "2-Cikarma islemi\n"
                + "3-Carpma islemi\n"
                + "4-Bolme islemi\n"
                + "5-Uslu sayi hesaplama islemi\n"
                + "6-Faktoriyel hesaplama\n"
                + "7-Mod alma\n"
                + "8-Dikdortgen alan ve cevre hesaplama\n"
                + "9-Cikis yap\n";
        
        System.out.println(menu);

        do {
            System.out.print("Bir islem seciniz= ");
            select = scan.nextInt();
            
            switch(select){
            case 1:
                toplama(a,b);
                break;
            
            case 2:
                cikarma(a,b);
                break;
                
            case 3:
                carpma(a,b);
                break;
                
            case 4:
                bolme(a,b);
                break;                    
             
            case 5:
                usAlma(a,b);
                break;
                
            case 6:
                faktoriyel(a);
                break;
                
            case 7:
                mod(a,b);
                break;
                
            case 8:
                dikdortgen(a,b);
                break;
            
            case 9:
                System.out.println("Program kapaniyor..");
                break;
                
            default:
                System.out.println("Lutfen 1-9 arasinda bir sayi giriniz!");
                
            }           
            } while (select != 0);
        
        System.out.println("program kapaniyor..");       
    }
}
