

class A{
    int a;
   protected  void play(){
        System.out.println("Need to Play()!....");
    }
}
class B extends A{
    void runs(){
        System.out.println("Need to Run()!.....");
    }
}
class C extends A{
    void stand(){
        System.out.println("Need to Stand()!....");
    }
}

  class program2 {
public static void main(String[] args) {
    A a = new A();
    a.play();
    B b  =new B();
    b.play();
    b.runs();
    C c  = new C();
    c.play();
    c.stand();
    
}
}