class cop{
    public cop(int a){
        System.out.println("New Comp");
    }
    public cop(float f){
        System.out.println("Old Comp");
    }
    public cop(String s){
        this(2.34344f);
        System.out.println("String Comp");
    }
}
public class program4{
    public static void main(String[] args) {
        cop c =new cop("sdc");
    }
}