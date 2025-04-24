class Threadimplement implements  Runnable{
public void run(){
    for(int i=0;i<5;i++){
        System.out.println("Diomen Threads");
    }
}
}
public class program2{
    public static void main(String[] args) {
        Threadimplement ti = new Threadimplement();
        Thread th =new Thread(ti);
        th.start();
        for(int i=0;i<5;i++){
            System.out.println("Main thread!....");
        }
        System.out.println("Program Ends");
    }
}