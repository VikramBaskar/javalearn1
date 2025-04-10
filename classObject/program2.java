class child{

}
class parent{
    public int hashCode(){
        return 123;
    }
}
public class program2{
    public static void main(String[] args) {
        child c = new child();
        parent p = new parent();
        System.out.println(c.hashCode());
        System.out.println(p.hashCode());
    }
}