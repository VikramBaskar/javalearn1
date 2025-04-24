class alpha{
    int a;
    alpha(){
        a =10;
        System.out.println("Alpha is still running");
    }
}
public class program7{
    public static void main(String[] args) {
        alpha a = new alpha();
        System.out.println(a.a);
    }
}