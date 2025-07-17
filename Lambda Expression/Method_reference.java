
import java.util.ArrayList;

class Method_reference{
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(12);
        ar.add(23);
        ar.add(45);
        // ar.forEach(action -> System.out.println(action));

        ar.forEach(System.out::println);
    }
}