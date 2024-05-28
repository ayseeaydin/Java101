package java101;
import java.util.Arrays;
public class TekrarEdenSayi {

    // Bir sayı dizisinde tekrar eden sayıları bulan program

    static boolean kontrol(int[] arr, int deger){
        for(int i: arr){
            if(i==deger)
                return true;
        }
        return false;
    }   
    
    public static void main(String[] args) {
        
        int[] dizi={3,7,3,3,2,9,10,21,1,33,9,1};
        int[] tekrarEden=new int[dizi.length];
        int baslangic=0;
        
        for(int i=0;i<dizi.length;i++){
            for(int j=0;j<dizi.length; j++){
                
                if((i!=j) &&(dizi[i]==dizi[j])){
                    if(!kontrol(tekrarEden, dizi[i])){                                        
                    tekrarEden[baslangic++]=dizi[i];
                    }
                    break;
                }
                
            }
        }
        System.out.println(Arrays.toString(tekrarEden));
        /*bu çıktıda tekrarEden dizisindeki tüm değerleri gösterir.
        herhangi bir değer yoksa onun yerine 0 gösterir. 0 ları göstermemesi
        için sonuç adında bir dizi oluşturucam: */
        System.out.println("--------------------");
        
        int[] sonuc= Arrays.copyOf(tekrarEden, baslangic);
        System.out.println(Arrays.toString(sonuc));
        
    }
}
