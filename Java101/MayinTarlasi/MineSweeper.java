import java.util.Random;
import java.util.Scanner;
public class MineSweeper {
    
    int rowNumber, colNumber, size; //Oynanacak tablonun satır-sütun ve toplam kare sayısını belirler
    
    int[][] map; // hazırlanmış oyun haritası/ son kullanıcıya gösterilmez
    int[][] board; // oynayacağımız oyunun haritası
    boolean game= true;
    
    Random rand= new Random();
    Scanner input= new Scanner(System.in);
    
    MineSweeper(int rowNumber, int colNumber){
        this.rowNumber=rowNumber;
        this.colNumber=colNumber;
        this.map= new int[rowNumber][colNumber];
        this.board= new int[rowNumber][colNumber];
        this.size=rowNumber*colNumber;
        
        prepareGame();
    }  
    
    public void run(){  // oyunun çalıştığı yer
        int row, col;
        int success=0;
        print(map);
        
        System.out.println("Oyun Basladi");
        
        while(game){
            print(board);
            System.out.print("Satir: ");
            row=input.nextInt();
            System.out.print("Sutun: ");
            col=input.nextInt();
            
            if(row<0||row>=rowNumber||col<0||col>=colNumber){
                System.out.println("Gecersiz Koordinat!");
                continue;
            }
            
            if(map[row][col]!=-1){
                check(row,col);
                success++;
                if(success==(size-(size/4))){
                    System.out.println("Tebrikler!!! Hicbir mayina basmadiniz...");
                    break;
                }
            }
            else{
                game=false;
                System.out.println("Mayina bastiniz.. Oyun Bitti!");
            }
        }
    }
    
    public void check(int r, int c){
            
        if(board[r][c]==0){  // hücrenin daha önce açılıp açılmadığını kontrol eder
        
            if((c<colNumber-1)&&(map[r][c+1]==-1)){
                board[r][c]++;
            }
            if((c>0)&&(map[r][c-1]==-1)){
                board[r][c]++;
            }
            if((r<rowNumber-1)&&(map[r+1][c]==-1)){
                board[r][c]++;
            }
            if((r>0)&&(map[r-1][c]==-1)){
                board[r][c]++;
            }
            if(board[r][c]==0){
                board[r][c]=-2;
            }
            
        }
    }
   
    
    public void prepareGame(){ // oyunun hazırlandığı metot
        int randRow, randCol, count = 0;
        
        while(count!=(size/4)){
            randRow= rand.nextInt(rowNumber);
            randCol= rand.nextInt(colNumber);
            
            if(map[randRow][randCol]!=-1){
                map[randRow][randCol]=-1;
                count++;
            }
        }
    }
    
    public void print(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]<=0){
                    System.out.print("  ");  
                }
                if(arr[i][j]==0){
                    System.out.print("-");
                }
                else if(arr[i][j]==-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
