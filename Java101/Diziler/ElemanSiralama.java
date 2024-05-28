package java101;
import java.util.Scanner;
import java.util.Arrays;
public class ElemanSiralama {
    public static void main(String[] args) {
        /*Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız.
        Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.*/
        
        Scanner input= new Scanner(System.in);
        
        System.out.print("Lutfen dizinin boyutunu giriniz: ");
        int n= input.nextInt();
        
        int[] dizi= new int[n];
        
        System.out.print("Lutfen dizinin elemanlarini giriniz: ");
        for(int i=0;i<dizi.length;i++){
            dizi[i]= input.nextInt();
        }
        
        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));       
        
    }
}
