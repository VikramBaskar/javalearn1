class Threadable extends Thread{

public void  run(){
    for(int i=0;i<5;i++){
        System.out.println("Main Thread!......");
    }
}
}
class program7{
    public static void main(String[] args) {
        System.out.println("Program Starts@...");
        Threadable td = new Threadable();
        td.start();
        for(int i=0;i<5;i++){
            System.out.println("Thread flow");
        }
        System.out.println("program ends!...");
    }
}