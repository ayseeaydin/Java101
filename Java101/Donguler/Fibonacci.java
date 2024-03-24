// FİBONACCİ SERİSİ
package java101;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        // Java döngüler ile fibonacci serisi bulan program yazınız. 
	// Fibonacci serisinin eleman sayısını kullanıcıdan alın.
	// 9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34
        
        System.out.print("eleman sayisini giriniz= ");
        int eleman=input.nextInt();
        
        int ilkEleman=0, ikinciEleman=1;
        
        for(int i=1;i<=eleman;i++){
            System.out.print(ilkEleman+" ");
            int gecici=ilkEleman+ikinciEleman;
            ilkEleman=ikinciEleman;
            ikinciEleman=gecici;
        }
    }
}
