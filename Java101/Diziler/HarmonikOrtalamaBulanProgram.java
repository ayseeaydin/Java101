package java101;
import java.util.Scanner;
public class HarmonikOrtalamaBulanProgram {
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        
        // Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.
        // Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi
        // Harmonik ortalama, n eleman sayısı ve x1, x1, ... , xn ortalaması alınacak dizinin elamanları olmak üzere
        // Harmonik Ortalama formülü : n (eleman sayısı) / (1/x1+1/x2+1/x3+...+1/xn)
        
        System.out.println("Dizinin boyutunu giriniz: ");
        int i= input.nextInt();
        
        int[] dizi= new int[i];
        
        System.out.println("Dizinin elemanlarını giriniz: ");
        for(int j=0;j<dizi.length;j++){
            dizi[j]=input.nextInt();
        }
        
        // Harmonik ortalamayı hesaplayalım:
        double harmonikToplam=0.0; //harmonik seri sonucunu ifade eder
        double ortalama;
        
        for(int j=0;j<dizi.length;j++){
            harmonikToplam+=1.0/dizi[j];
        }
        
        ortalama=dizi.length/harmonikToplam;
        System.out.println("Ortalama= "+ ortalama);
    }
   
}
