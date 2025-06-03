class sampleThread implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("SampleThread!??????");
        }
    }
}
class program5{
    public static void main(String[] args) {
        System.out.println("Program Starts!.........");
        sampleThread st = new sampleThread();
        Thread th =new Thread(st);
        th.start();
        for(int i=0;i<5;i++){
            System.out.println("Main Thread!.......");
        }
        
         System.out.println("Program Ends !.........");
    }
   
}