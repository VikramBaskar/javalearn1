//interface 

interface engine{
       int a=12;
    void  test();
    abstract  void dog();
    
}

  class sample implements engine{
 
    public  void test(){
        System.out.println("engine starts");
    }
   public  void dog()
    {
        System.out.println("poda");
    }
}
public  class program1{
    public static void main(String[] args) {
        sample e =new sample();
        e.test();
        e.dog();
      System.out.println(sample.a);
        
    }
}