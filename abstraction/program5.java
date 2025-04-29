abstract class bottle{
  int a =12;
 abstract void color();
}
 class Shape extends bottle{
   public void circle(){
        System.out.println("Shape of Bottle is Circle");
    }
    
  public  void Square(){
    System.out.println("Shape Of Bottle Is Square");
   }
     void color(){
            System.out.println("this is Abstract color");
        }
      
}
class program5{
    public static void main(String[] args) {
        Shape sh  = new Shape();
       
        sh.color();
    

    }
}