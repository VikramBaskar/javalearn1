
import java.util.Arrays;
import java.util.List;


public class ForEachExample {
    public static void main(String[] args) {
  // List<String> names = Arrays.asList("John","JILla","jafEr","JAck");
  // //names.forEach(name -> System.out.println(name));
  // names.stream().forEach(namees ->System.out.println(namees.toLowerCase()));
    List<String> name = Arrays.asList("Vikram","Vidhiya","Vimlal","Tonney","Jonny");
    name.stream().forEach(names ->System.out.println(names.toUpperCase()));
      
    }
}
