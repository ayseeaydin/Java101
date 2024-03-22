package java101;
import java.util.Scanner;
public class Hipotenus{
   
    //DİK ÜÇGENDE HİPOTENÜS BULAN PROGRAM

    public static void main(String[] args) {
        Scanner girdi= new Scanner(System.in);
        
        int a,b;
        float c;
        
        System.out.println("ucgenin birinci kenar uzunlugunu giriniz= ");
        a=girdi.nextInt();
        System.out.println("ucgenin ikinci kenar uzunlugunu giriniz= ");
        b=girdi.nextInt();
        
        c= (float) Math.sqrt((a*a)+(b*b)); // c*c=(a*a)+(b*b) olduğu için ve bunu kodlayamayacağım için matematik kütüphanesi kullanıp sağ tarafın karekökünü alıcam
        
        System.out.println("Hipotenus= "+c);
                 
  
    }
}
    
    

