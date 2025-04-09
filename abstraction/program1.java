// Abstraction

abstract class alpha{
    abstract  void send();
    abstract  void receive();
    void end(){
        System.out.println("motta end!...");
    }
}
  class beta extends alpha{
    void send(){
        System.out.println("poda send!...");
    }
    void receive(){
        System.out.println("vada receive!...");
    }
}
public  class program1{
    public static void main(String[] args) {
        alpha a = new beta();
        a.send();
        a.receive();
        a.end();

    }
}