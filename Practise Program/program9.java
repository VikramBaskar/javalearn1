class demos{
 int a;
 public void run(int a){
  this.a=10;
    System.out.println("This is demo");
 }
}
 class patch extends demos{
    String s="patch";
    public void stop(String s){
        this.s="bottle";
         System.out.println("Reinilize the value");
    }
 }
 class program9{
    public static void main(String[] args) {    
      demos g = new patch();

      g.run(12);
      
    }
 }
