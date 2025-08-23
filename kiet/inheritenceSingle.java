package kiet;

class Employee{
    int id;
    String name;
    String org;
    public void details(){
        System.out.println("id : "+id+" name: "+name+" organisation: "+org);
    }

}

class faculty extends Employee{
    String dept;
    String sub;
    public void details1(){
        System.out.println("Department: "+dept+" Subject: "+sub);
    }

}

public class inheritenceSingle {
    public static void main(String[] args) {
        faculty f1=new faculty();
        f1.id=101;
        f1.name="kriss";
        f1.org="kiet";
        f1.dept="aiml";
        f1.sub="dsa";
        f1.details();
        f1.details1();

    }
}
