// RECURSİVE İLE FİBONACCİ SERİSİ BULAN PROGRAM
package java101;

public class Fibonacci {

    static int f(int i) {

        if (i == 1 || i == 2) {
            return 1;
        }

        return f(i - 1) + f(i - 2);
    }

    public static void main(String[] args) {
        System.out.println(f(2));
        // 1 1 2 3 5 8 13 21
    }

}
