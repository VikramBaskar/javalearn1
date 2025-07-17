
  @FunctionalInterface
public interface interfacedemo{

    // public abstract void test();
    public  int add(int a,int b);
    // public abstract void test3();
    default  void test1(){
        System.out.println("hi I'm a Abstract method !....");
    }
    default void test4(){

    }
    static void test2(){
       System.out.println("Hi I'm a static method !....");
    }
     
     static void test5(){

     }
}