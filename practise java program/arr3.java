
import java.util.Arrays;
import java.util.Scanner;

class arr3{
    public static void main(String[] args) {
        int[] ar =new int[5];
        Scanner sc = new Scanner(System.in);
        // int i=0;
    for(int i=0;i<ar.length;i++){
        System.out.println("Enter the number !.......");
        ar[i] = sc.nextInt();
      
     
    }
   int sum=0;
   for(int i=0;i<ar.length;i++){
    sum +=ar[i];
   }

      System.out.println("Sum of array is "+sum);
    System.out.println("Entered value :"+Arrays.toString(ar));


    }
}