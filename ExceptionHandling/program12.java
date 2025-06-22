class program12{
public static void main(String[] args) {
    System.out.println("program starts");
    try{
        int a = 10/0;
         System.out.println(a);

    }catch(ArithmeticException e){
       e.printStackTrace();
    }
}
}