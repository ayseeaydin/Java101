package maashesaplayici;

public class Employee {
    String name;
    double salary; //çalışanın maaşı
    int workHours; //haftalık çalışma saati
    int hireYear;//işe başlangıç yılı
    
    Employee(String name, double salary, int workHours, int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    
    
    //tax() : Maaşa uygulanan vergiyi hesaplayacaktır.
    //Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
    //Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
    
    double tax(){ //vergi,
        double tax = 0;
        if(this.salary>1000){
            tax=this.salary*0.03;
        }
        if(this.salary<1000){
            tax=0;
        }            
        return tax;
    }
    
    //bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
    
    int bonus(){
        int bonus=0;
        if(this.workHours>40){
            bonus=(this.workHours-40)*30;
        }
        return bonus;
    }
    
    //raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
    //Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
    //Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
    //Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
    
    double raiseSalary(){
        int workingYear=2021-this.hireYear; //workingYear: çalıştığı yıl süresi
        double raiseSalary;
        
        if(workingYear<10){
            raiseSalary=this.salary*0.05;            
        }
        else if(workingYear>9&&workingYear<20){
            raiseSalary=this.salary*0.10;            
        }
        else{
            raiseSalary=this.salary*0.15;
        }        
        return raiseSalary;
    }
    
    public String toString(){
        double calculatedTax=tax();
        int calculatedBonus=bonus();
        double calculatedRaise=raiseSalary();
        return "Adi: "+this.name
               +"\nMaasi: "+this.salary
               +"\nCalisma Saati: "+this.workHours
               +"\nBaslangic Yili: "+this.hireYear
               +"\nVergi: "+tax()
               +"\nBonus: "+bonus()
               +"\nMaas Artisi: "+raiseSalary()
               +"\nVergi ve bonuslar ile birlikte maas: "+(this.salary+calculatedBonus-calculatedTax)
               +"\nToplam Maas: "+(this.salary+calculatedBonus+calculatedRaise-calculatedTax);                
    }

    
    
    
        
    }

