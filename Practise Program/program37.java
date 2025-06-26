// abstract method
abstract class animal{
    abstract void disp();
    abstract void play();
    void sample(){
        System.out.println("Sample animal!....");
    }
}
class cattle extends animal{
    void disp(){
        System.out.println("Display the cattle");
    }
    void play(){
            System.out.println("Playing the animal");
    }
}
public class program37{
    public static void main(String[] args) {
            animal ca = new cattle();
          ca.disp();
          ca.play();
          ca.sample();
    }
}