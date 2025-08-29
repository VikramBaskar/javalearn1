
import java.util.Arrays;

class program2{
    public static void main(String[] args) {
      int[] ar={10,2,3,4,5,6,7};
    //   System.out.println(Arrays.stream(ar)); 
    Arrays.stream(ar).sorted()
        .forEach(System.out::println);   
    }
}