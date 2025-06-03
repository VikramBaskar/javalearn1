class program8{
    private static program8 instance =new program8();
    private program8(){}
        public static program8 getInstance(){
            return instance;
        }
    
public void showMessage(){
    System.out.println("Hi");
}
}