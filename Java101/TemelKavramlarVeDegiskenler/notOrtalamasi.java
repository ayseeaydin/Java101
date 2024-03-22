package java101;
import java.util.Scanner;
public class Java101 {
   
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        //Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
        //Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
        
        float matematik, turkce, fizik, kimya, biyoloji, muzik, beden;  // ortalama alacağım ve sonuc küsüratlı çıkabileceği için float kullandım
        
        System.out.print("Matematik notunu giriniz: ");
        matematik=inp.nextFloat();
        
        String mat= matematik >=60 ? "gectiniz.. " : "kaldiniz.. ";
        System.out.println("matematik'ten "+ mat);
        
        
        System.out.print("Turkce notunu giriniz: ");
        turkce=inp.nextFloat();
        
        String trkc= turkce >=60 ? "gectiniz.. " : "kaldiniz.. ";
        System.out.println("turkce'den "+ trkc);
        
        
        System.out.print("Fizik notunu giriniz: ");
        fizik=inp.nextFloat();
        
        String fzk= fizik >=60 ? "gectiniz.. " : "kaldiniz.. ";
        System.out.println("fizik'ten "+ fzk);
        
        
        System.out.print("Kimya notunu giriniz: ");
        kimya=inp.nextFloat();
        
        String kmy= kimya >=60 ? "gectiniz.. " : "kaldiniz.. ";
        System.out.println("Kimya'dan "+ kmy);
        
        
        System.out.print("Biyoloji notunu giriniz: ");
        biyoloji=inp.nextFloat();
        
        String blj= biyoloji >=60 ? "gectiniz.. " : "kaldiniz.. ";
        System.out.println("Biyoloji' den "+ blj);
        
        
        System.out.print("Beden notunu giriniz: ");
        beden=inp.nextFloat();
        
        String bdn= beden >=60 ? "gectiniz.. " : "kaldiniz.. ";
        System.out.println("Beden Egitimi'nden "+ bdn);
        
        
        System.out.print("Muzik notunu giriniz: ");
        muzik=inp.nextFloat();
        
        String mzk= muzik >=60 ? "gectiniz.. " : "kaldiniz.. ";
        System.out.println("Muzik'den "+ blj);
        
        float toplam= matematik+turkce+fizik+kimya+biyoloji+muzik+beden;
        float genelOrt = toplam/6;
        
        System.out.println("Genel ortalamaniz= "+genelOrt);
        
        String gano= genelOrt>=60? "sinifi gectiniz..":"sinifi gecemediniz..";
        System.out.println(gano);  
        
        
  
    }
}
    
    

