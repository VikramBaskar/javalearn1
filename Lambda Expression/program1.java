

 class program1 implements interfacedemo{
 
   @Override
     public void test(){
      System.out.println("game program1");
     }
 public static void main(String[] args) {
    //   program1 p = new program1();
      interfacedemo d= new program1();
      d.test();
      d.test1();
      interfacedemo.test2();
    //   d.test();
   
 }
 }