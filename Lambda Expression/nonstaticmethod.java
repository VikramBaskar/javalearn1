
// static method and default method for non static
public interface nonstaticmethod{
    //   public static void main(String[] args){
    //     System.out.println("hi");

    default void calculate(int a,int b){
      System.out.println(a+b);
    }

    static void test6(){
      System.out.println("Static - test");
    }
      }
