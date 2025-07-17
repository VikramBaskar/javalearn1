
import java.util.Arrays;


//     public static void main(String[] args) {
//         int[] ar ={1,2,3,4,0,34,55,78};
//         int min=ar[0];
//         for(int i=0;i<ar.length;i++){
//             if(ar[i]<min){
//                 min=ar[i];
//             }
//         }
//         System.out.println("Minimum: "+min);
//     }
// }
// Stream method
// class program47{
//     public static void main(String[] args) {
//         int[] ar={1,2,3,4,56,67,78,0,12};
//         int min=Arrays.stream(ar)
//         .min().getAsInt();
//         System.out.println("Minimum: "+min);
//     }
// }

// String method in stream object

class program47{
    public static void main(String[] args) {
        String[] ar={"1","2","3","5","34","0","23"};
        int min =Arrays.stream(ar)
        .mapToInt(Integer::parseInt)
        .min().getAsInt();
        System.out.println("Minimum: "+min);
    }
}