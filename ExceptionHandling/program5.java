class myCustomerException extends Exception {

     myCustomerException() {
System.out.println("showing error");
    }

}

public class program5{
    static void trigger(int num)throws myCustomerException{
        if(num%2==0&&num%3==0){
        throw new myCustomerException();
        }else{
        System.out.println("all is well");
        
        }
    }
    public static void main(String[] args) {
    try {
        trigger(25);
        trigger(16);
        trigger(18);
    } catch (myCustomerException e) {
        e.printStackTrace();
    }
    }
}