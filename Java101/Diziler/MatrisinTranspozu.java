package java101;
public class MatrisinTranspozu {
    public static void main(String[] args) {
      
        /*
        // Java dilinde, çok boyutlu diziler ile oluşturulmuş matrisin transpozunu bulan programı yazınız.
        Matrisin transpozunu (devriğini) almak, matrisin aynı numaralı satırları ile sütunlarının yer değiştirmesi demektir. 
        Bu işlem sonucu elde edilen matris, başlangıçtaki matrisin transpozudur (devriğidir). 
        */
        
        int[][] matris = {{2, 3, 4},
                          {5, 6, 4}};
        
        int[][] transpozeMatris= new int[matris[0].length][matris.length];
        
        for(int i=0; i<matris[0].length;i++){
            for(int j=0; j<matris.length;j++){
                transpozeMatris[i][j]=matris[j][i];
            }
        }
        
        System.out.println("Transpoze matris: ");
        
        for(int i = 0; i < transpozeMatris.length; i++){
            for(int j = 0; j < transpozeMatris[i].length; j++){
                System.out.print(transpozeMatris[i][j] + " ");
            }
            System.out.println();
        }        
    }
}
