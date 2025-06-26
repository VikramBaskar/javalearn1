//method overriding

class sample{
  static    public void test(){
        System.out.println("Method sample");
    }
}
class demo extends sample{
   static  public void pass(){
        System.out.println("method demo");
    }
}
public class program36{
    public static void main(String[] args) {
        demo d = new demo();
        d.pass();
        sample s =new sample();
        s.test();
        System.out.println("overriding");
        //  demo ds =new sample(); decleration is wrong
        sample ds = new demo();
        ds.test();
    }
}