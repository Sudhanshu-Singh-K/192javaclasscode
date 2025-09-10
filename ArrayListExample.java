import java.util.ArrayList;
// import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        // ArrayList fruits=new ArrayList();  // In array list data type and size is not fixed
        // fruits.add("Apple");
        // fruits.add("Banana");
        // fruits.add("Grapes");
        // fruits.add(1);
        // System.out.println(fruits);

        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");
        // fruits.add(1);   // Will through error
        System.out.println(fruits);

        for(String s:fruits){
            System.out.println(s);
        }

        System.out.println(fruits.get(2));
        System.out.println(fruits.set(2,"Guava"));
        System.out.println(fruits);
        
    }
}
