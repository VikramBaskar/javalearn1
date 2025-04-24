class table{

    public table(int a) {
        System.out.println("Blue table");
    }
    table(double d){
        System.out.println("Brown table");
    }

    public table(String s) {
        this(12);
        System.out.println("Green Table");
    }
  
}
public class program3{
    public static void main(String[] args) {
       table t = new table(2.3) ;
    }
}
