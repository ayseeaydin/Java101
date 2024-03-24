// TERS ÜÇGEN YAPIMI
package java101;

import java.util.Scanner;

public class TersUcgen {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("lutfen satir sayisini giriniz= ");
        int satir= input.nextInt();
        
        for(int i=satir; i>=1; i--){
           
            for(int j= 1; j<=2*i-1;j++){
                System.out.print("*");
            }            
            System.out.println(" ");           
        }
    }
}
