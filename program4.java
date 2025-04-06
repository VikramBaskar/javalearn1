
import java.util.Scanner;

class program4{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your age :");
        try {
            String s = sc.nextLine();
            int age =Integer.parseInt(s);
            if(age<0 || age>120){
                System.out.println("Please enter a valid age ");
            }
            else{
                System.out.println("Enter Your age is :"+age);
            }
        } catch (NumberFormatException e) {
        }
    }
}