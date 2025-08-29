
import java.util.Arrays;



class program4{
    public static void main(String[] args) {
        int[] ar ={1,2,3,4,5,6,7,8,9,10,1,2,3};
        // Remove the duplicate value in given array using distinct method 
         // Arrays.stream(ar).distinct().forEach(System.out::println);
        
        // Another way 
        // Arrays.stream(ar) .distinct()
        // .forEach(elem -> System.out.println(elem));

        Arrays.stream(ar).distinct()
        .filter(n ->n%4==0)
        .forEach(System.out::println);
    }
}