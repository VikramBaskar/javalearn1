// constructor chaining super() operator
class demo{
    demo(int a){
        System.out.println("Executing Demo(1)!......");
    }
    demo(double d){
        System.out.println("Executing demo(1.2)");
    }

}
class sample extends demo{
    sample(){
        super(2.2);
        System.out.println("Executing sample()!....");
    }
}


public class program2{
    public static void main(String[] args) {
   sample s = new sample();

    }
}