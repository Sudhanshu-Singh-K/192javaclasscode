public class StringExample {
    public static void main(String[] args) {
        String name="Sudhanshu";
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.substring(2,5));
        String s="SUDHANSHU";
        if(name.equals(s)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
    }
}
