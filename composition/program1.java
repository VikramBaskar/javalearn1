class Engine{
    void power(){
        System.out.println("Engine deliver power()!.....");
    }
}
class car{
    Engine e  = new Engine();
}
public class program1{
    public static void main(String[] args) {
        car c =new  car();
        c.e.power();
    car c1 = new car();
    c1.e.power();
    }
}