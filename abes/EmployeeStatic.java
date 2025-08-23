package abes;

// public class EmployeeStatic { //main class can't be made static but nested classes can be made static
//     int Emp_Id;
//     static String org = "kiet";
//     // static{
//     //     org="kiet";
//     // }
//     static void staticMethod(){  //static method
//         System.out.println("This is a static method");  //static methods ke under hum static variables ko hi use kr skte hai
//     }
//     void details(){ //normal method
//         System.out.println("ID: "+Emp_Id+" Organisation: "+org);
//     }
//     public static void main(String[] args){
//         EmployeeStatic es=new EmployeeStatic();
//         es.Emp_Id=123;
//         //es.org="Kiet";
//         es.details();
//         EmployeeStatic es2=new EmployeeStatic();
//         es2.Emp_Id=124;
//         // es2.org;
//         es2.details();  //normal method call
//         staticMethod();  //static method call


//     }
// }


class OuterClass{
    private static String msg="Kiet";
    public static class NestedstaticCass{
        public void main(){
            System.out.println("Message "+msg);
        }
    }
}
