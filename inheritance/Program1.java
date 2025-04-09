 class demo{
    void test(){
        System.out.println("Executing demo!.....");
    }
}
class test extends demo{
    void disp(){
        System.out.println("Executing disp()!.....");
    }
}
public class Program1{
public static void main(String[] args) {
    test t  =new test();
    t.disp();
    t.test();
}
}