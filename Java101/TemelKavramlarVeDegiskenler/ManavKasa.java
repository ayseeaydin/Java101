package java101;
import java.util.Scanner;
public class ManavKasa {

    // Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine 
    // göre toplam tutarını ekrana yazdıran programı yazın.
    // Armut : 2,14 TL
    // Elma : 3,67 TL
    // Domates : 1,11 TL
    // Muz: 0,95 TL
    // Patlıcan : 5,00 TL
    
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        float armut, elma, domates, muz, patlican,toplam;
        
        System.out.print("armut miktari(kg)= ");
        armut=input.nextFloat();
        
        System.out.print("elma miktari(kg)= ");
        elma=input.nextFloat();
        
        System.out.print("domates miktari(kg)= ");
        domates=input.nextFloat();
        
        System.out.print("muz miktari(kg)= ");
        muz=input.nextFloat();
        
        System.out.print("patlican miktari(kg)= ");
        patlican=input.nextFloat();
        
        toplam=(float) ((armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlican*5.0));
        
        System.out.println("odeyeceginiz toplam ucret= "+toplam);
               

    }
}
    
    

