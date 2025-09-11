
import java.util.Arrays;
import java.util.Scanner;

class arr5{
    public static void main(String[] args) {
        
        int[] ar = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<ar.length;i++){
            System.out.println("Enter the number :");
            ar[i] = sc.nextInt();

        }
         
         int sum=0;
         for(int i=0;i<ar.length;i++){
            sum +=ar[i];
         }
         int div=0;
            if(sum !=0){
                 div = sum/2;
            }

         int[] sumarray  = {sum};
              System.out.println("Sum of an entered array "+Arrays.toString(sumarray));
              System.out.println("divide number : "+ div);
    }
}