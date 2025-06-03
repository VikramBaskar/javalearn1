class box{
   public void sound(){
    System.out.println("Sound bar produce more sound");
   }
}
class vfx extends box{
    int a=12;
    public void  company(){
        System.out.println("The company produce sound bar");
     
    }
}
class program6{
    public static void main(String[] args) {
        box b = new vfx();
        b.sound();
        vfx v = new vfx();
        v.company();
        v.sound();
        
    }
}