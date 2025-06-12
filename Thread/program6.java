class Multithread implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Multi thread!........");
        }
    }
}
class program6{
    public static void main(String[] args) {
        System.out.println("Program Strats!.......");
        Multithread mt =new Multithread();
        Thread t = new Thread(mt);
        t.start();
        for(int i=0;i<5;i++){
            System.out.println("Main Thread");
        }
        System.out.println("Program Ends");
    }
}