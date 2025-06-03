class match extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Match Threads!.....");
        }
    }
}
public class program4{
    public static void main(String[] args) {
        System.out.println("Program Starts!....");
        match m = new match();
        m.start();
        for(int i=0;i<5;i++){
            System.out.println("Main Threads!''''''");
        }
        System.out.println("Program Ends!....");
    }
}