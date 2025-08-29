
import java.util.Arrays;
import java.util.stream.IntStream;
class program58{
    // public static void main(String[] args) {
    //     int[] sd ={1,2,3,4,5};
    //     int[] aw =IntStream.range(0, sd.length)
    //     .map(i ->sd[sd.length-1-i])
    //     .toArray();
    //     System.out.println("Reversed int[]: "+Arrays.toString(aw));
    // }

    // public static void main(String[] args) {
    //     Integer[] input ={1,2,3,4,5};

    //   List<Integer> rev = IntStream.range(0, input.length)
    //                     .mapToObj(i ->input[input.length-1-i])
    //                     .collect(Collectors.toList());

    //                         System.out.println("Reversed: "+rev );
    // }

    // public static void main(String[] args) {
    //     int[] zx ={1,2,3,4,5,6,7};
    //     int[] asd =IntStream.range(0, zx.length)
    //                 .map(i ->zx[zx.length-1-i])
    //                 .toArray();
    //                 System.err.println("Reversed Arrays : "+Arrays.toString(asd));
    // }

    // public static void main(String[] args) {
    //     Integer[] df ={1,2,3,4};
    //    List<Integer> hnd =IntStream.range(0, df.length)
    //                     .mapToObj(i ->df[df.length-1-i])
    //                     .collect(Collectors.toList());
    //                     System.out.println("Reversed Array in collections : "+hnd);
    // }
    public static void main(String[] args) {
        int[] inp ={1,2,3,4,5,6,7,8};
        int[] res =IntStream.range(0, inp.length)
                    .map(i -> inp[inp.length-1-i])
                    .toArray();
                    System.out.println("Reversed Array : "+Arrays.toString(res));
    }
    
}