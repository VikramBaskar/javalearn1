
import java.util.Scanner;

class program3{
    public static void main(String[] args) {
        System.out.println("Input your age :");
        Scanner sc  = new Scanner(System.in);
        String s= sc.nextLine();
        int age = Integer.parseInt(s);
        if(age >=18 && age<25 ){
            System.out.println("You are Adult");
        }
        else if(age <=13){
            System.out.println("You are Teenager");
        }
        else if(age>=25){
            System.out.println("You are elegible for vote");
        }
      
        else{
           System.out.println("you are not a teenager or adult"); 
        }

    }
}