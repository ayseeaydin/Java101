// Java'da döngüler kullanılarak yıldızlar ile üçgen yapınız.

package java101;
import java.util.Scanner;
public class YildizlarlaUcgen {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        //n: satır sayısı
        //k: boşluk değeri
        //j: yıldız sayısı
        
        System.out.print("lutfen satir sayisini giriniz= ");
        int n= input.nextInt();
        
        for(int i=1; i<=n;i++){
            
            for(int k=1;k<=(n-i);k++){                
                System.out.print(" ");            
            }
            
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
                System.out.println(" ");
        }
        
    }
    
}

