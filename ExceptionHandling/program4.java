
import java.util.Scanner;

public class program4{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Program Starts");
        try {
            int val = sc.nextInt();
            System.out.println("Value :"+ val);
        }
        finally{
            sc.close();
            System.out.println("Program Ends");
        }
    }
}