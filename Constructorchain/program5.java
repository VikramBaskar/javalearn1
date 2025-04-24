class demo{
    demo(){
        System.out.println("Ddemo()Constructor");
    }
}
class sample extends demo{
    public sample(){
        //super();
        System.out.println("Sample()Constructor");
    }
}
public class program5{
    public static void main(String[] args) {
        sample s = new sample();

    }
}