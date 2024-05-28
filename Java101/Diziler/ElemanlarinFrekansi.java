package java101;
import java.util.Arrays;
public class ElemanlarinFrekansi {
    public static void main(String[] args) {
        
        //Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yazınız.
        
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20, 30, 30};
        
        Arrays.sort(dizi);
        
        int tekrarSayisi = 1;
        
        for (int i = 0; i < dizi.length - 1; i++) {
            if (dizi[i] == dizi[i + 1]) {
                tekrarSayisi++;
            } 
            else {
                System.out.println(dizi[i]+" sayısı " + tekrarSayisi + " kere tekrar edildi.");
                tekrarSayisi = 1;
            }
        }
        System.out.println(dizi[dizi.length - 1] + " sayısı " + tekrarSayisi + " kere tekrar edildi.");
    } 
}
