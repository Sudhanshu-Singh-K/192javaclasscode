import java.util.*;
class EmployeeEncap{
    private int Account_balance;  //data hiding
    private int upi_pin=998899;
    public void setBalance(int balance){  //This method updates the balance
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter UPI pin : ");
        int pin=sc.nextInt();
        if(pin==upi_pin){
            Account_balance=balance;
            System.out.println("Congratulations salary is credited !");
        }else{
            System.out.println("Salary not credited");
        }
    }
    public int getBalance(){
        Scanner sc=new Scanner(System.in);
        System.out.println("To know the balance please enter the upi pin : ");
        int pin =sc.nextInt();
        if(pin==upi_pin){
            System.out.println("Available balance is : "+Account_balance);
            return Account_balance;
        }else{
            System.out.println("!!Wrong Pin!! Unable to fetch balance");
        }
        return -1;
    }
}



public class Encapsulation {
    public static void main(String[] args) {
        EmployeeEncap ee=new EmployeeEncap();
        ee.setBalance(90000);

        ee.getBalance();
    }
}
