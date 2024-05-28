package java101;
import java.util.Scanner;
import java.util.Arrays;
public class MaxMin {
    
    public static void main(String[] args) {
        
        // Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.

        Scanner input= new Scanner(System.in);
                
        int[] dizi={56,34,1,8,101,-2,-33};
         
        System.out.println("Bir sayi giriniz: ");
        int sayi=input.nextInt();
        
        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));
        
        int min=0;
        int max=0;
        
        for(int i : dizi){
            if(i<sayi){
                min=i;                
            }            
        }
        
        for(int j : dizi){
            if(j>sayi){
                max=j;
                break;
            }
        }
        
        System.out.println("Girilen sayıya yakın en küçük sayı= "+min);
        System.out.println("Girilen sayıya yakın en büyük sayı= "+max);
    }
}
