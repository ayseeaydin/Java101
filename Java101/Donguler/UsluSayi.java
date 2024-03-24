//ÜSLÜ SAYI HESAPLAYAN PROGRAM
package java101;

import java.util.Scanner;

public class Java101 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı yazıyoruz.
        
        int sonuc=1;
        int n,k;
        System.out.print("lutfen taban degerini giriniz= ");
        n=input.nextInt();
        
        System.out.print("lutfen us degerini giriniz= ");
        k=input.nextInt();
        
        for(int i=1; i<=k;i++){
            sonuc*=n;
        }
        System.out.println("girdiginiz sayinin ussu= "+sonuc);
    }
}
