// try and catch and finallyfg
import java.util.InputMismatchException;
import java.util.Scanner;

public class program3{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Value");
        try {
            int val = scn.nextInt();
            System.out.println("value :"+val);

        } catch (InputMismatchException e) {
            System.out.println("Input value format will wrong");
        }
        finally {
            scn.close();
            System.out.println("Scanner Closed");
        }
    }
    
}