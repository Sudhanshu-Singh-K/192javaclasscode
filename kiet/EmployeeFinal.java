package kiet;

final public class EmployeeFinal { //final prevents a class from being inherited
        final String org="kiet";  //prevents from changing the value
       final void detailsOfEmp(){  //final method prevents it from overriding
            System.out.println(org);
        }
        public static void main(String[] args){
            EmployeeFinal ef=new EmployeeFinal();
            //ef.org="abes";
            ef.detailsOfEmp();
        }
    
}

// class Faculty extends EmployeeFinal{
//     // void detailsOfEmp(){
//     //     System.out.println("Welcome to overriding");
//     // }
//     public static void main(String[] args) {
//         Faculty f=new Faculty();
//         f.detailsOfEmp();
//     }
// }
