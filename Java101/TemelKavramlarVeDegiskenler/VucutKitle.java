package java101;
import java.util.Scanner;
public class Java101 {
    
    //Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
    //Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
    //Formül= Kilo (kg) / Boy(m) * Boy(m)
    
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        float kilo,boy,indeks;
        
        System.out.print("Lutfen boyunuzu giriniz= ");
        boy=input.nextFloat();
        
        System.out.print("Lutfen kilonuzu giriniz= ");
        kilo=input.nextFloat();
        
        indeks=kilo/(boy*boy);
        
        System.out.println("Vucut kitle indeksiniz= "+indeks);
               

    }
}
    
    

