
//upcasting
class cash{
    void paycash(){
        System.out.println("pay a cash");
    }
    void collectcash(){
        System.out.println("Scanm to pay");
    }
}
class digipay extends cash{
    void UPI(){
        System.out.println("pay using UPI");
    }
    void scanpay(){
        System.out.println("Payment using scan");
    }
}
class bankpay extends digipay{
    void challen(){
        System.out.println("challen pay");
    }
}
public class program5{
    public static void main(String[] args) {
    bankpay bp  =new bankpay();
    bp.challen();
    bp.paycash();
    cash c = bp;
    c.collectcash();

    }
}

