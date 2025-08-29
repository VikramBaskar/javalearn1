
import java.util.Arrays;
import java.util.stream.IntStream;



class program63{
    public static void main(String[] args) {
        // int[] io ={1,2,3,4,5,6,7,8,9};
        // int[] as =IntStream.range(0, io.length)
        //         .map(i ->io[io.length-1-i])
        //         .toArray();
        //         System.out.println(" Reverse array :"+Arrays.toString(as));

        int[] as ={1,2,3,4,5,6,7,8,9,0};
        // int[] sc =IntStream.range(0, as.length)
        //             .map(i ->as[as.length -1-i])
        //             .toArray();
        //             System.out.println("reverse Arrays is : "+Arrays.toString(sc));
         int[] sd=IntStream.range(0, as.length)
                    .map(i->as[as.length-1-i])
                    // .distinct()
                    .toArray();
                    System.out.println("reverse Arrays is : "+ Arrays.toString(sd));

    }
}