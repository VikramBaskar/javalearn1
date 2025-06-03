abstract class door{
   final  int a=1;
    abstract void book();

}
class window extends door{
    void  book(){
        System.out.println("Sending values in abstract class");
    }
}
class program7{
public static void main(String[] args) {
    
    door w = new window();
    w.book();
 
}
}