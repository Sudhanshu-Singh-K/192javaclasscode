public class ExceptionExample {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        try{
        System.out.println(100/0);  //Arithmetic, runtime/unchecked exception (will through exception during runtime not during compilation)
        System.out.println("Inside try block");  //Yah code nhi run ho payega
                                //try comes with either catch or finally or both but not alone
        }catch(Exception ex){// class name and reference variable
          System.out.println(ex);  
        }
        System.out.println(5);// An exception object contains :- Exception name, description and stack_trace (kis line me exception hui hai)
        System.out.println(6);
    }
}
