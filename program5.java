
import java.util.Scanner;

class program5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is Ur name? ");
        String name =sc.nextLine();
        System.out.printf("Hello %s. how old are you? ",name);
        int age =sc.nextInt();
        System.out.printf("%d is an excellent age to start programming",age);
        String language = sc.nextLine();
        System.out.printf("%s is a very popular language",language);
        sc.close();
    }
}