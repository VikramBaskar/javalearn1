class cop{

}
class station{
 public  String toString(){
    return "comp";
   }
   public int hashCode(){
    return 133222;
   }

}
public class program10{
    public static void main(String[] args) {
        station st = new station();
        cop c = new cop();
        System.out.println(st.toString());
        System.out.println(st.hashCode());
        System.out.println(c.toString());
        System.out.println(c.hashCode());

    }
}