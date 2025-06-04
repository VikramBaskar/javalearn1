class demo{

}
class usage{
    public String toString(){
        return "This is Class Object";
    }
}
public class program10{
    public static void main(String[] args) {
        demo d = new demo();
        usage u = new usage();
        System.out.println(d.toString());
        System.out.println(u.toString());
    }
}