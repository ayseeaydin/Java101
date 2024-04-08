package ogrencibilgisistemi;
public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;   // prefix ile Teacher sınıfındaki branch değerinin aynı olması gerekiyor
    int note;
    
    Course(String name, String code, String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        int note=0;
    }
    
    void addTeacher( Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
        this.teacher=teacher; 
        }else{
            System.out.println("Ogretmen bolumu ve ders uyusmuyor!");
        }
    }
    
    void printTeacher(){
        this.teacher.print();  // Teacher sınıfından print metodunu getirip çalıştırır
    }
    
}
