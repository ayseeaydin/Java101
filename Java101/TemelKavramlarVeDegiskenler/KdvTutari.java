package java101;
import java.util.Scanner;
public class Java101 {
    
    //Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
    //(Not : KDV tutarını 18% olarak alın)
    //KDV'siz Fiyat = 10;
    //KDV'li Fiyat = 11.8;
    //KDV tutarı = 1.8;
    
    //Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
   
    public static void main(String[] args) {
        Scanner giris= new Scanner(System.in);
        
        float fiyat, kdvliFiyat, kdvTutari,kdvOrani;
        
        
        System.out.print("Urunun fiyatini giriniz: ");
        fiyat=giris.nextFloat();
        
        if(fiyat>0 && fiyat<1000){
            kdvOrani=0.18f;
        }
        else{
            kdvOrani=0.08f;
        }        
        
        kdvTutari=fiyat*kdvOrani;
        kdvliFiyat=fiyat+kdvTutari;
        
        System.out.println("KDV'siz fiyat= "+fiyat);
        System.out.println("KDV orani= "+kdvOrani);
        System.out.println("KDV tutari= "+kdvTutari);
        System.out.println("KDV'li fiyati= "+kdvliFiyat);          
  
    }
}
    
    

