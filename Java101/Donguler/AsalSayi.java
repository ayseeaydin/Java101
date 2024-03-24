// 1-100 ARASINDAKİ ASAL SAYILARI BULAN PROGRAM
package java101;

public class AsalSayi {

    public static void main(String[] args) {
        
        for(int i=2;i<=100;i++){
            boolean asal=true;
            
            for(int j=2;j<i;j++){
                if(i%j==0){
                    asal=false;
                    break;
                }
            }
            
            if(asal)
                System.out.print(i+" ");
        }       
    }
}
