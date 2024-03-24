// ATM PROJESİ
package java101;

import java.util.Scanner;

public class AtmProjesi{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kullaniciAdi, sifre;
        int kalanHak = 3;
        int bakiye = 1500;
        int miktar, secim;

        while (kalanHak > 0) {
            System.out.print("Kullanici adini giriniz: ");
            kullaniciAdi = input.nextLine();
            System.out.print("Sifreyi giriniz: ");
            sifre = input.nextLine();

            if (kullaniciAdi.equals("patika") && sifre.equals("dev123")) {
                System.out.println("Merhaba! Kodluyoruz Bankasina hosgeldiniz!");

                do {
                    System.out.println("""
                                       1-Para yatirma
                                       2-Para cekme
                                       3-Bakiye sorgulama
                                       4-Cikis yap """);
                    System.out.print("Lutfen yapmak istediginiz islemi seciniz: ");
                    secim = input.nextInt();

                    switch (secim) {
                        case 1:
                            System.out.print("Yatirilacak para miktari= ");
                            miktar = input.nextInt();
                            bakiye += miktar;
                            break;
                            
                        case 2:
                            System.out.print("Cekilecek para miktari= ");
                            miktar = input.nextInt();
                            
                            if (miktar > bakiye) {
                                System.out.println("Bakiye yetersiz!");
                            } else {
                                bakiye -= miktar;
                            }   break;
                            
                        case 3:
                            System.out.println("Bakiyeniz= " + bakiye);
                            break;
                            
                        default:
                            System.out.println("Lutfen 1-4 arasiinda bir sayi giriniz.");
                            break;
                    }
                    
                } while (secim != 4);
                System.out.println("Iyi gunler! Tekrar gorusmek uzere..");
                break;
                
            } else {
                kalanHak--;
                if (kalanHak == 0) {
                    System.out.println("Hesabiniz bloke olmustur. Lutfen banka ile iletisime geciniz.");
                } else {
                    System.out.println("Hatali kullanici adi veya sifre. Tekrar deneyiniz!");
                    System.out.println("Kalan giris hakkiniz: " + kalanHak);
                }
            }
        }       
    }
}

