
import java.util.Arrays;


//         int a =fg[0];
//         int b=fg[0];
//         System.out.println("Even numbers!....");
//         for(int i=0;i<fg.length;i++){
//             if(fg[i]%2==0){
//             a=fg[i];
//             System.out.println(a);
//             }  
//         }
//         System.out.println("Odd numbers!....");
//            for(int i=0;i<fg.length;i++){
//                if(fg[i]%2 !=0){
//                 b=fg[i];
//                 System.out.println(b+" ");
//                } 
//             }

//     }
// }

// class program55{
//     public static void main(String[] args) {
//         // int[] we ={12,3,4,5,5,6,6,3,3,4,55,6,788,8,99,};

// //   System.out.println("Even numbers!...");
// //        Arrays.stream(we)
// //        .filter(n -> n%2==0)
// //        .forEach(n -> System.out.println(n));
// //        System.out.println("Odd numbers!.....");
// //        Arrays.stream(we)
// //        .filter(n -> n%2 !=0)
// //        .forEach(n -> System.out.println(n));
    
//     int[] ret ={1,2,3,4,5,6,7,8};
//     Arrays.stream(ret)
//     .filter(n-> n%2 ==0)
//     .forEach(n -> System.out.println(n));

//     Arrays.stream(ret)
//     .filter(n -> n%2 !=0)
//     .forEach(n -> System.out.println(n));
//     }
    
// }

class program55{
    public static void main(String[] args) {
        int[] qw ={1,2,3,4,5,5,6,7,78,0,9,5,6,8};
        System.out.println("Original Array : "+Arrays.toString(qw));

        int[] even =Arrays.stream(qw)
                .filter(n ->n%2==0)
                .toArray();

        int[] odd=Arrays.stream(qw)
                .filter(n -> n%2 !=0)
                .toArray();
                System.out.println("Even number = "+Arrays.toString(even));
            
            System.out.println("Odd number = "+Arrays.toString(odd));
    }
}