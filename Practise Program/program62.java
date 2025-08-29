
import java.util.Arrays;





class program62{
    public static void main(String[] args) {
        int[] ad ={1,2,3,4,5,6,7,8,9,0,12,23,24};
      // second largest program
      
        // int secondlar =Arrays.stream(ad)

        //             .distinct()
        //             .boxed()
        //             .sorted((a,b)->b-a)
        //             .skip(1)
        //             .findFirst()
        //             .orElseThrow(()->new RuntimeException("No need largest element"));
        //           System.out.println("Second max num "+secondlar);
        
        // largest num
        // int lar =Arrays.stream(ad)
        //             .sorted()
        //             .max()
        //             .getAsInt();
        //             System.out.println("maximum number in given array : "+lar);
                    

        // Smallest num
        // int small =Arrays.stream(ad)
        //             .sorted()
        //             .min()
        //             .getAsInt();
        //             System.out.println("Smallest number in Arrays : "+small);

        //reverse array
        int[] arr =Arrays.stream(ad)
                    .filter(n->n%2==0)
                    .toArray();
        int rev = arr.length;
                    System.out.println("array even : "+Arrays.toString(arr));

    }
      
}