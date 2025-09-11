
import java.util.Arrays;
import java.util.Scanner;

class arr4{
    public static void main(String[] args) {
        int [] as =new int[4];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<as.length;i++){
            System.out.println("Enter the number for multiply");
            as[i]=sc.nextInt();

        }
         int mul =1;
         for(int i=0;i<as.length;i++){
            mul *=as[i];
         }
         int[] resultarray ={mul};
            System.out.println("Multiply of given number is: "+mul);
            System.out.println("Arrays in multiply list : "+Arrays.toString(as));
            System.out.println("Given Product in array is : "+Arrays.toString(resultarray));
    }
}