import java.util.Scanner;
public class Main {
    public static void main(String[] args) {        
        
        Scanner input= new Scanner(System.in);
        
        System.out.println("Mayin Tarlasina Hosgeldiniz!");
        System.out.println("Lutfen oynamak istediginiz boyutlari giriniz.");
        
        int row, column;
        System.out.print("Satir sayisi: ");
        row=input.nextInt();
        System.out.print("Sutun sayisi: ");
        column=input.nextInt();
        
        MineSweeper mayin= new MineSweeper(row, column);
        mayin.run();
        
    
    }

}

    

