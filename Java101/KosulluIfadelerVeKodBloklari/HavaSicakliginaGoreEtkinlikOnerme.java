// HAVA SICAKLIĞINA GÖRE ETKİNLİK ÖNERME
//Koşullar:
//Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
//Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
//Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
//Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

package java101;
import java.util.Scanner;
public class HavaSicakliginaGoreEtkinlikOnerme {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        int sicaklik;
        
        System.out.print("lutfen sicaklik degerini giriniz= ");
        sicaklik=input.nextInt();
        
        if(sicaklik<=5){
            System.out.println("kayak yapabilirsiniz. sicaklik= "+sicaklik+" derece");
        }
        else if(sicaklik>5 && sicaklik<=25){
            
            if(sicaklik<=15){
                System.out.println("sinemaya gidebilirsiniz. sicaklik= "+sicaklik+" derece");
            }
            if(sicaklik>=15 && sicaklik<=25){
                System.out.println("piknige gidebilirsiniz. sicaklik= "+sicaklik+" derece");
            }
        }
        else{ 
            System.out.println("yuzmeye gidebilirsiniz. sicaklik= "+sicaklik+" derece");
        }
        
    }
}
    
    

