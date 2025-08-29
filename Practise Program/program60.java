
import java.util.Arrays;
import java.util.Scanner;



class program60{
    // public static void main(String[] args) {
    //     int[] tr ={1,2,3,5,5};
    //     Scanner scn  = new Scanner(System.in);
    //       System.out.println("Enter number to be match : ");
    //     int target =scn.nextInt();
      
    //     boolean rf =Arrays.stream(tr)
    //             .anyMatch(n -> n==target);
    //             if(rf){
    //                 System.out.println(target+" exists in the array");
    //             }
    //             else{
    //                 System.out.println(target+" does't match the entered number");
    //             }
    // }

    public static void main(String[] args) {
        int[] sd ={1,2,3,4,5,6,7,8};

        Scanner sc =new  Scanner(System.in);
        int df= sc.nextInt();
        
        boolean ss =Arrays.stream(sd)
                    .anyMatch(n -> n%2==df);

          if(ss){
            System.out.println(ss+" element Exits in array");
          } 
          else{
            System.out.println(ss+" element not in array");
          }         
                    
    }
}