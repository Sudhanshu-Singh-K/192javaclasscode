interface Institute{// Interface does not contain conctrete methods, can have public,static,final variable
    void  Register();
    void Infrastructure();//They are by default abstract and public
    void Students();
    void Staff();
    // void medicalFacility(){
    //     System.out.println("Medical Facilities are optional : ");
    // }

    //static,default,private methods are also allowed 

    static void staticConcrete(){
        System.out.println("This is static concrete method inside interface.");
    }
    default void defaultConcrete(){
        privateConcrete();
        System.out.println("This is default concrete method inside interface.");
    }
    private void privateConcrete(){
        System.out.println("This is private concrete method inside interface.");
    }
}

class ABESS implements  Institute{//to inherit interface
    public void Register(){//they are by default 'default' that's why we have to write public before the methods of interface
        System.out.println("Kiet is registered with AKTU.");
    }
    public void Infrastructure(){
        System.out.println("Kiet has digital classrooms and labs.");
    }
    public void Students(){
        System.out.println("Admissions through counselling.");
    }
    public void Staff(){
        System.out.println("Kiet has well trained staff.");
    }
    // void medicalFacility(){
    //         System.out.println("Kiet has its own hospital in the campus.");
    //     }
    
}

public class InterfaceExample {
    public static void main(String[] args) {
        Institute ii;//We can only make refernce variable for abstract class but not objects ; it must be defined with respect to the child class as methods in abstract class is often incomplete.
        ii=new ABESS();
        ii.Register();
        ii.Infrastructure();
        ii.Students();
        ii.Staff();
        // cg.medicalFacility();
        Institute.staticConcrete();
        ii.defaultConcrete();


    
    }
}

//class inherits class --> extends
//class inherits interface --> implements
//interface inherits interface --> extends
//interface does not inherit interface
