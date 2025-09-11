
@FunctionalInterface
public interface contract1{
    public int  rule1(int a, int b);

    public static void rule2(){
        System.out.println("rule 2 Static Method");
    }

    public default void rule3(){
        System.out.println("rule 3 Default Method");
    }
}