
import java.util.Arrays;

   class demo{
    public static void main(String[] args) {
      
      
      //sorting using streams:

        int[] ar={1,8,3,4,5,6,7,12,45,2};
        // System.out.println(ar.length);
        // IntStream s = Arrays.stream(ar);
        // Long len = s.count();
        // System.out.println(len);
        // s = s.sorted();
        // s.forEach(no -> System.out.println(no));
        // s.forEach(System.out::println);

        //another type;
        Arrays.stream(ar)
        .sorted()
        .forEach(System.out::println);

    }
   }