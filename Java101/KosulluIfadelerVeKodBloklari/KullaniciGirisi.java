// KULLANICI GİRİŞİ
// kullanıcı adı=patika  şifre=java123
//Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, 
//eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , 
//şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.

package java101;
import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kullaniciAdi, sifre, cevap, yeniSifre;

        System.out.print("lutfen kullanici adinizi giriniz: ");
        kullaniciAdi = input.next();

        System.out.print("lutfen sifreyi giriniz: ");
        sifre = input.next();

        if (kullaniciAdi.equals("patika") && sifre.equals("java123")) {    //  Stringlerde eşitliği sorgulamak için eşittir işareti kullanamayız. equals kullanıyoruz
            System.out.println("Giris basarili! ");
        }
        else if (!(kullaniciAdi.equals("patika")) && (sifre.equals("java123"))) {
            System.out.println("kullanici adiniz yanlis. Lutfen tekrar deneyiniz!");
        }
        else if ((kullaniciAdi.equals("patika")) && !(sifre.equals("java123"))) {
            System.out.println("Sifreniz yanlis! sifrenizi sifirlamak ister misiniz? ");
            cevap = input.next();

            if (cevap.equals("evet")) {
                System.out.print("Lutfen yeni sifrenizi giriniz: ");
                yeniSifre = input.next();

                if (yeniSifre.equals("java123")) {
                    System.out.println("sifre olusturulamadi. lutfen eski sifrenizi girmeyiniz!");
                }
                else {
                    System.out.println("yeni sifreniz olusturuldu");
                }

            }
            else {
                System.out.println("sifrenizi sifirlama onerisini reddettiniz. Giris yapabilmek icin lutfen sifrenizi giriniz! ");
            }
        }
        else {
            System.out.println("kullanici adi ve sifreniz yanlis, lutfen tekrar deneyiniz!");
        }
    }

}
    
    

