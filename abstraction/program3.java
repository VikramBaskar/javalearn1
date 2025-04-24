//Interface
interface bema{
    void test();
}
class kaliya implements bema{
    public void pair(){
System.out.println("gone");
    }
    public void test(){
        System.out.println("test implement");
    }
}
public class program3{
    public static void main(String[] args) {
        kaliya k =new kaliya();
        k.pair();
        k.test();

    }
}