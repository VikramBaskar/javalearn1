public interface nonstaticmethod1{
    //   public static void main(String[] args){
    //     System.out.println("hi");

    default void calculate(int a,int b){
      System.out.println(a+b);
    }
      }