public class methodCode{
    int id;  //instance variable
    String name;
    methodCode(){ //Constructor (are used to initialise value)
        // id =101;  //if we will not give values the constructor will assign default values. i.e. 0 and null
        // name="Sud";
        System.out.println("Hello from default constructor");
        //System.out.println("Details are: "+id+" "+name);
    }
    methodCode(int id,String name){ //local variable
        this.id=id;   //this.id is instance while id is local
        this.name=name;
        System.out.println("This is parametrized constructor");
    }
    public void displayMethod(){
        System.out.println("Hello from Display method");
        System.out.println("Details are: "+id+" "+name);
    }
    public static void main(String[] args){
        methodCode m1=new methodCode();// m1 is reference variable
        m1.id=101;
        m1.name="Sud";
        m1.displayMethod();

        methodCode m2=new methodCode();
        m2.id=102;
        m2.name= "SS";
        m2.displayMethod();
        methodCode m3= new methodCode(103,"Singh");
        m3.displayMethod();
    }
}

