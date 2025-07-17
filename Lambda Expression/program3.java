class program3 implements program{
   @Override
   public void simple(){
    System.out.println("This is simple from interface");
   }



public static void main(String[] args) {
   program p = new program3();
   System.out.println( p.demo(12, 34));
    
}
  
   

    
}