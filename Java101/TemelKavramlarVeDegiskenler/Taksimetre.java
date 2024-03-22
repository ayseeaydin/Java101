package java101;
import java.util.Scanner;
public class Java101 {
   // TAKSİMETRE HESAPLAYAN PROGRAM
    
   //Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
   //Taksimetre KM başına 2.20 TL tutmaktadır.
   //Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
   //Taksimetre açılış ücreti 10 TL'dir.

    public static void main(String[] args) {
        Scanner giris= new Scanner(System.in);
        
        float ucret;
        float kmUcret=2.20f;
        
        int km;
        System.out.print("Mesafeyi km cinsinden giriniz= ");
        km=giris.nextInt();
        
        ucret=(km*kmUcret)+10;
        ucret=(ucret<=20)?20:ucret;        
        
        System.out.println("Odenecek ucret= "+ucret);       
  
    }
}
    
    

