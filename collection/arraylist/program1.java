
import java.util.ArrayList;
import java.util.Collections;

 class program1{
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("beem");
        fruits.add("dinal");
        fruits.add("Apple");
        fruits.add("Avacoda");
        Collections.sort(fruits);
        System.out.println(fruits);//ascending
        Collections.sort(fruits, Collections.reverseOrder());//descending
         
        System.out.println(fruits);

    
       


    }
 }