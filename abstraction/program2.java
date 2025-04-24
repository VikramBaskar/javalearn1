abstract class Demon{

}
  class GameOn extends  Demon{
 
   final  void send()
   {
    System.out.println("Gameod");
   }
 
   final  void receive(){
    System.out.println("skjvnjsnvj");
  }
  }
public class program2{
    public static void main(String[] args) {
        GameOn g = new GameOn();
        g.send();
        g.receive();
    }
}