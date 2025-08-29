
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class program1{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tom", "Jerry", "Anna", "Jack");

names.forEach(name -> System.out.println(name.toUpperCase()));

List<String> filtered = names.stream()
                             .filter(name -> name.startsWith("J"))
                             .collect(Collectors.toList());

System.out.println(filtered); // [Jerry]
    
    }
}