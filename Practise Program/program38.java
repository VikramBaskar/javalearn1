//interface
interface delta{
    int a=10;
    void play();
    void disp();
    
}
class example implements delta{
    @Override
    public void play(){
             
        System.out.println("play interface");
    }
    public void disp(){
        System.out.println("disp interface");
    }
}
class program38{
    public static void main(String[] args) {
        delta d = new example();
        d.disp();
        d.play();
        System.out.println(d.a);
    }
}