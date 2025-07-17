 
 @FunctionalInterface
 interface program{
 public abstract void simple();
  default  int demo(int a,int b){
    return(a+b);
 }
 
    static void  variable(){
        System.out.println("vikram-output");
    }
}