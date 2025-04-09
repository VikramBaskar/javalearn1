// downcasting 
class A{
    void test(){
        System.out.println("Testing A!.....");
    }
}
class B extends  A{
    void disp(){
        System.out.println("Disping B!....");
    }
}

class C extends B{
    void play(){
        System.out.println("Playing C!....");
    }
}
public class porgram3 {
public static void main(String[] args) {
    A a =new C();
    a.test();
    
    B b = (B)a;
    b.disp();
    b.test();
}
}