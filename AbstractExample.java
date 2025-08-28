abstract class College{// Abstract method can only be defined in abstract cl6ass
    abstract  void  Register();
    abstract void Infrastructure();
    abstract void Students();
    abstract void Staff();
    void medicalFacility(){
        System.out.println("Medical Facilities are optional : ");
    }
}

class KIETT extends College{//All abstract methods should be overridden in the extended class
    void Register(){
        System.out.println("Kiet is registered with AKTU.");
    }
    void Infrastructure(){
        System.out.println("Kiet has digital classrooms and labs.");
    }
    void Students(){
        System.out.println("Admissions through counselling.");
    }
    void Staff(){
        System.out.println("Kiet has well trained staff.");
    }
    void medicalFacility(){
            System.out.println("Kiet has its own hospital in the campus.");
        }
    
}

public class AbstractExample {
    public static void main(String[] args) {
        College cg;//We can only make refernce variable for abstract class but not objects ; it must be defined with respect to the child class as methods in abstract class is often incomplete.
        cg=new KIETT();
        cg.Register();
        cg.Infrastructure();
        cg.Students();
        cg.Staff();
        cg.medicalFacility();
    }
}
