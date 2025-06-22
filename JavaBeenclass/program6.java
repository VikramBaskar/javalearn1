//singleton class
class program6{
    private static program6 instance=new program6();
    private program6(){

    }
    public static   program6 getInstance(){
         return instance;
    }
      public void showMessage(){
        System.out.println("Hello from program 6");
      }
}