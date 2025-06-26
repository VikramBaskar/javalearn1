
import java.util.Scanner;

//palindrome
class program40{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number!...");
        int number = scn.nextInt();
        int original =number;
        int reverse =0;

        while(number !=0){
            int digit =number%10;
            reverse = reverse *10+digit;
            number=number/10;
        }
        if(original == number)
        System.out.println(original+"is a palindrome...");
        if(original != number){
            System.out.println(original+"is not a palindrome....");
        }
    }
}