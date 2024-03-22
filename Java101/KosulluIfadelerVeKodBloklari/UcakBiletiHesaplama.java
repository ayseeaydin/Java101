// UÇAK BİLETİ FİYATI HESAPLAMA
// Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. 
// Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
// Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını 
// hesaplayın ve sonrasında aşağıdaki koşullara göre müşteriye aşağıdaki indirimleri uygulayın.
// Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk 
// tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" 
// şeklinde bir uyarı verilmelidir.
// Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
// Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
// Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
// Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim 
// uygulanır.
package java101;

import java.util.Scanner;

public class UcakBiletiHesaplama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("gidilecek mesafe= ");
        int mesafe = input.nextInt();

        System.out.print("yas= ");
        int yas = input.nextInt();

        System.out.println("yolculuk tipi(1-tek yon, 2-gidis/donus)");
        int yolculukTipi = input.nextInt();

        float ucret = mesafe * 0.10f;

        System.out.println("indirimsiz bilet fiyati= " + ucret);

        if (mesafe > 0 && yas > 0 && yolculukTipi > 0 && yolculukTipi <= 2) {

            if (yas < 12) {
                ucret = (float) (ucret - (ucret * 0.50));
            } else if (yas <= 24) {
                ucret = (float) (ucret - (ucret * 0.10));
            } else if (yas >= 65) {
                ucret = (float) (ucret - (ucret * 0.30));
            }
        } else {
            System.out.println("hatali veri girdiniz!");
        }

        if (yolculukTipi == 2) {
            ucret = (float) (ucret - (ucret * 0.20));
        }

        System.out.println("indirimli bilet fiyati= " + ucret);
    }
}
