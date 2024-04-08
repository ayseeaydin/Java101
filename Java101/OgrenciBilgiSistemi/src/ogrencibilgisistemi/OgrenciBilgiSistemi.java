package ogrencibilgisistemi;
public class OgrenciBilgiSistemi {
    public static void main(String[] args) {
                      
        Teacher t1= new Teacher("Mahmut Hoca","TRH","0000");  //Burada nesne tanımlıyorum nesnemin adı t1
        Teacher t2=new Teacher("Graham Bell","FZK","1111");
        Teacher t3=new Teacher("Kulyutmaz","BIO","2222");
        
        /*                
        Course tarih=new Course("Tarih","101","TRH",t1); //tarih nesnesinin içine parametre olarak teacher için t1 değerini verdim
        tarih.printTeacher();  //Course sınıfından çağırdığımız printTeacher metodunun içinde Teacher metodundaki print() metodu çağırılmış
        //bu yüzden bize direkt Teacher sınıfından print metodunu çağırmışız gibi çıktı verecek { t1.print();  kodunu yazmışız gibi  }
        
        yukarıdaki kod Course constructor unda teacher parametresi de varken denenmiş bir şeydi.
        daha sonra parametreyi ordan sildim
        */                 
        
        Course tarih= new Course("Tarih","101","TRH"); // nesne oluşturdum
        tarih.addTeacher(t1); //nesnenin içinde nitelik gibi tanımladığım teacher nesnesinin değerini girdim. Bunu yapmak için addTeacher adında bir metot oluşturdum
//      tarih.printTeacher();
        Course fizik=new Course("Fizik","101","FZK"); //derslerin hocalarla uyuşması için Course sınıfında addTeacher metodunda koşul koydum
        fizik.addTeacher(t2);
//      fizik.printTeacher();
        Course biyoloji=new Course("Biyoloji","101","BIO");
        biyoloji.addTeacher(t3);
//      biyoloji.printTeacher();
      
        Students s1=new Students("Inek Saban","1234","12/A",tarih,fizik,biyoloji); //nesne oluşturdum
        s1.addBulkExamNote(100, 200, 50);  //ders notlarını girdim
        s1.isPass();  // ortalamayı hesapladı, geçip-kalma durumunu ve notları gösterdi
        
        Students s2=new Students("Guduk Necmi","5678","12/A",tarih,fizik,biyoloji);
        s2.addBulkExamNote(80, 65, 93);
        s2.isPass();
        
        Students s3=new Students("Hayta Ismail","9101","12/A",tarih,fizik,biyoloji);
        s3.addBulkExamNote(75, 100, 75);
        s3.isPass();
        
    }
    
}
