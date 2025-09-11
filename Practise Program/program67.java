
// abstraction !-----------------

abstract class phone{
  abstract  void call();
  abstract  void receive();
  public void  msg(){
    System.out.println("Sending And Receive msg!.....");
  }
}
 class mobiles extends phone{
    public void call(){
        System.out.println("Call To Connecting!.....");
    }
    public void receive(){
        System.out.println("Receive A Call !.......");
    }
}

public class program67 extends mobiles{
 
 public static void main(String[] args) {
     phone ph = new mobiles();
     ph.call();
     ph.msg();
     ph.receive();
 }
}