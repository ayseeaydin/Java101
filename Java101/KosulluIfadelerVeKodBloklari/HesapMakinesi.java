// SWİTCH-CASE KULLANARAK HESAP MAKİNESİ 

package java101;
import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        int sayi1, sayi2, secilenIslem;
        
        System.out.print("iki sayi giriniz= ");
        sayi1=input.nextInt();
        sayi2=input.nextInt();
        
        System.out.print("Yapilacak islemi seciniz (1:+, 2:-, 3:*, 4:/)= ");
        secilenIslem= input.nextInt();
        
        switch (secilenIslem) {
            case 1:
                System.out.println("toplama isleminin sonucu= "+ (sayi1+sayi2));
                break;
            case 2:
                System.out.println("cikarma isleminin sonucu= "+ (sayi1-sayi2));
                break;
            case 3:
                System.out.println("carpma isleminin sonucu= "+(sayi1*sayi2));
                break;
            case 4:
                if(sayi2==0){
                    System.out.println("bir sayi 0 a bolunemez!");
                }
                else{
                    System.out.println("bolme isleminin sonucu= " +(sayi1/sayi2));
                }
                break;
            default:
                     System.out.println("yanlis secim yaptiniz. lutfen 1-4 arasi bir sayi giriniz!");
                     break;
        }
    }

}
    
    

