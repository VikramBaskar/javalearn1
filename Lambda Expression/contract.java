

@FunctionalInterface
public interface contract{
  public abstract void display(int no);

  default int disp(int a, int b){
    return a*b;
  }

   static  void  find(){
    System.out.println("Hi this is static find method");
  }
}