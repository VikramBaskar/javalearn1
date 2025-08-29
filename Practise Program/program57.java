
import java.util.Arrays;



class program57{
    public static void main(String[] args) {
        int[] df ={1,2,3,4,5,56,67,89,01};
        System.out.println("Given Array : "+Arrays.toString(df));
        int[] num = Arrays.stream(df)
                    .filter(n-> n%2 ==0)
                    .toArray();
                    System.out.println("The Even Arrays : "+Arrays.toString(num));

        int[] num1 =Arrays.stream(df)
                    .filter(n -> n%2 !=0)
                    .toArray();
                    System.out.println("The Odd Arrays: "+Arrays.toString(num1));
        int[] 
    }
}