package ogrencibilgisistemi;
public class Teacher {
    String name;
    String mpno;
    String branch;
      
    //branch: dal-bölüm-branş
    

    Teacher(String name, String branch, String mpno){
        this.name=name;
        this.mpno=mpno;
        this.branch=branch;
    }
    
    void print(){
        System.out.println("adi: "+this.name);
        System.out.println("telefon no: "+this.mpno);
        System.out.println("bolumu: "+this.branch);
    }
    
    
}
