
import java.util.Arrays;
import java.util.List;

public class program73{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Vikram","Mohan","Aravindh","RajKamal","Azar");
        names.stream().forEach(person ->System.out.println(person.toUpperCase()));
    }
}