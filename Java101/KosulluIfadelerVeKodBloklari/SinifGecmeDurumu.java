//SINIF GEÇME DURUMU 
//Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
//Geçme Notu : 55

package java101;
import java.util.Scanner;
public class SinifGecmeDurumu {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        int matematik, fizik, turkce, kimya, muzik ;
        double ortalama;
        
        System.out.print("matematik notunuz= ");
        matematik=input.nextInt();
        
        System.out.print("turkce notunuz= ");
        turkce=input.nextInt();
        
        System.out.print("fizik notunuz= ");
        fizik=input.nextInt();
        
        System.out.print("kimya notunuz= ");
        kimya=input.nextInt();
        
        System.out.print("muzik notunuz= ");
        muzik=input.nextInt();
        
        ortalama=(matematik+turkce+fizik+kimya+muzik)/5.0;
        
        if(ortalama<=55){
            System.out.println("maalesef sinifta kaldiniz.. Ortalamaniz= "+ortalama);           
        }
        else{
            System.out.println("Tebrikler.. sinifi gectiniz... Ortalamaniz= "+ortalama);
        }
        
    }
}
    
    

