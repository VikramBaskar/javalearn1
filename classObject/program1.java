//program toString

class demo{

}
class play {
  public String toString(){
    return "hi world";
  }
}
public class program1{
    public static void main(String[] args) {
        demo d = new demo();
        play p = new play();
        System.out.println(p.toString());
        System.out.println(d.toString());
    }
}