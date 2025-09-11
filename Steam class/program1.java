
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


//     public static void main(String[] args) {
//         List<String> names = Arrays.asList("Tom", "Jerry", "Anna", "Jack");

// names.forEach(name -> System.out.println(name.toUpperCase()));

// List<String> filtered = names.stream()
//                              .filter(name -> name.startsWith("J"))
//                              .collect(Collectors.toList());

// System.out.println(filtered); // [Jerry]
    
//     }
// }

class program1{
    public static void main(String[] args) {
        List<String> name = Arrays.asList("vikram","Thiruma","Siva","Bala");
        name.forEach(names -> System.out.println(names.toUpperCase()));
        List<String> filter =name.stream()
                                .filter(names -> names.startsWith("T"))
                                .collect(Collectors.toList());
                                // System.err.println(filter);
    }
}