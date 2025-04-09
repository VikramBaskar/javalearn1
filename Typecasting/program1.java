class alpha{
    void test(){
        System.out.println("Executing test()!....");
    }
}
class Beta extends  alpha{
    void disp(){
        System.out.println("Executing dist()!.....");
    }
}
public class program1{
    public static void main(String[] args) {
        Beta b = new Beta();
        b.disp();
        b.test();
        alpha a  =b;
        a.test();
    
    }
}