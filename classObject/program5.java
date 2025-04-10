//finalize method

class connection{
protected void finalize() throws Throwable{
   System.out.println("Clear all Resources");
}
}
public class program5{
    public static void main(String[] args) {
        connection co = new connection();
        System.gc();
        co =null;
        System.gc();
    }
}