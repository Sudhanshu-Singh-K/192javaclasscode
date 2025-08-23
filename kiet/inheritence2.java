package kiet;

class Employee{
    int id;
    String name;
    String org;
    String Emp_type;
    int Emp_Salary;
    public void printDetails(){
        System.out.println("Employee id is : "+id+" Employee name is : "+name+" His/Her organisation is : "+org);
    }
    public void printDetails1(){
        System.out.println("Employee is a : "+Emp_type+" Employee's salary is : "+Emp_Salary);
    }
}

class Emp_Basic_Details extends Employee{
    public static void main(String[] args) {
    Emp_Basic_Details emp=new Emp_Basic_Details();
    emp.id=101;
    emp.name="Puneet";
    emp.org="kiet";
    emp.printDetails();
}

}

public class inheritence2 extends Employee{
    public static void main(String[] args) {
    inheritence2 emp=new inheritence2();
    emp.Emp_type="Faculty";
    emp.Emp_Salary=20000;
    emp.printDetails1();
}


    
}
