class myexception extends Exception{

}
public class program7{
    static  void tigger(int num)throws myexception
    {
        if(num%2 ==0 && num%3==0)throw new myexception();
        else
        System.out.println("All is well");
    }
    public static void main(String[] args) {
        try {
            tigger(26);
            tigger(16);
            tigger(18);

        } catch (myexception e) {
            System.out.println(99);
            e.printStackTrace();
        }
    }
}