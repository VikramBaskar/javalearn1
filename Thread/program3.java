class DiamonTh extends Thread{
 public void run(){
         for(int i =0;i<=5;i++){
            System.out.println("Diamon Thread!.....");
         }
      }
}   
public  class program3{
    public static void main(String[] args) {
        System.out.println("Program Starts");
        DiamonTh D = new  DiamonTh();
        D.start();
        for(int i=0;i<=5; i++){
            System.out.println("Main Thread!@....");
        }
        System.out.println("Program Ends!.....");
    }
}