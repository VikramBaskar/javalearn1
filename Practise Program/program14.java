class connect{
    public void finalize() throws Throwable{
        System.out.println("Clear all the data");
    }
}

public class program14{
    public static void main(String[] args) {
        connect c =new connect();
        System.gc();
        c=null;
        System.gc();
    }
}