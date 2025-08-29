
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;



class program64{
    public static void main(String[] args) {
        int[] ar ={1,2,3,3,3,4,4,5,5,6};
        List<Integer> duplicates =Arrays.stream(ar)
                            .boxed()
                                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                                .entrySet().stream()
                                .filter(entry-> entry.getValue()>1)
                                .map(Map.Entry::getKey)
                                .collect(Collectors.toList());
                                System.out.println("Repeated elements : "+duplicates);
    }
}