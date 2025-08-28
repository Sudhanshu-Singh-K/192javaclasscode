class EmployeePoly{
    String Emp_name;

    void details(){
        System.out.println("Name : "+Emp_name);
    }

    void details(int salary){  //giving one parameter  
        System.out.println("Salary : "+salary);
    }

    void details(String company){ //giving different datatype parameter
        System.out.println("Institute name : "+company);
    }
    void details(int salary,String company){
        
    }
    void details(String company,int salary){

    }
}

class Faculty extends EmployeePoly{
    void details(){
        super.details(); //calls the details method of parent class
        System.out.println("Welcome faculty!");
    }
}


public class Polymorphism {
    public static void main(String[] args) {
        // EmployeePoly ep=new EmployeePoly();
        // ep.Emp_name="Arun";
        // ep.details();
        // ep.details(1000);
        // ep.details("KIET");
        Faculty f=new Faculty();
        f.Emp_name="Arun";
        f.details();
    }
}
