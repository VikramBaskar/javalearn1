
import java.util.Arrays;

class program3{
    public static void main(String[] args) {
        int[] ar ={10,2,3,4,5,60,20};
        // OptionalDouble od =Arrays.stream(ar)
        //                     .average();
    //     //                     System.out.println(od.getAsDouble());
    // double a =Arrays.stream(ar)
    //         .sorted()
    //         .average()
    //         .getAsDouble();
            
    //         System.out.println("Average of array element :"+a);
   
   // Maximum value in a array
   
    // OptionalInt as =Arrays.stream(ar)
    //            .max();
    //             System.out.println(as.getAsInt());

    // Minimum value in arrays
    // OptionalInt mi =Arrays.stream(ar)
    //                 .min();
    //                 System.out.println(mi.getAsInt());


    // Find the first element in given Arrays

    // OptionalInt df = Arrays.stream(ar)
    //                 .findFirst();
    //                 System.out.println(df);
    // OptionalInt xc =Arrays.stream(ar)
    //                 .findAny();
    //                 System.out.println(xc);
// To find the count of value----------------------------------
    Long arr =Arrays.stream(ar)
                    .count();
                    System.out.println(arr); 

    }
}