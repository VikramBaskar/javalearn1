class Connection {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("clear all resources");
    }
}

public class program13 {
    public static void main(String[] args) {
        Connection con = new Connection();
        con = null;  // eligible for GC
        System.gc(); // suggest JVM to run garbage collector

        // Give JVM some time (not reliable, just for demo)
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
    }
}
