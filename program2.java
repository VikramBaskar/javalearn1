
import java.util.Scanner;

class program2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        if(st.equals("rim")){
            System.out.println("You Typed rim");
        }
        else if(st.equals("tim")){
            System.out.println("Hi!");
        }
        else if (st.equals("Hello")) {
            System.out.println("Hi buddy");
        }
    }
}