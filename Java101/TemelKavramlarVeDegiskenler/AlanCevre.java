package java101;
import java.util.Scanner;
public class Java101 {
    //DAİRENİN ALANINI VE ÇEVRESİNİ HESAPLAYAN PROGRAM
    //Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
    //Alan Formülü : π * r * r;
    //Çevre Formülü : 2 * π * r;

    // Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
    // 𝜋 sayısını = 3.14 alınız.
    // Formül : (𝜋 * (r*r) * 𝛼) / 360
    
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        int r;
        double pi=3.14;
        int aci;
        
        
        System.out.print("Dairenin yaricapini giriniz= ");
        r=input.nextInt();
        
        System.out.print("Bir aci olcusu giriniz= ");
        aci=input.nextInt();
              
        float alan=(float) (pi*r*r);
        float cevre=(float) (2*pi*r);
        float dilimAlan=(float) ((pi*(r*r)*aci)/360);
        
        System.out.println("Dairenin alani= "+alan);
        System.out.println("Dairenin cevresi= "+cevre);
        System.out.println("Daire diliminin alani= "+dilimAlan);
               

    }
}
    
    

