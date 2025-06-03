
import java.io.Serializable;

class program4 implements Serializable{
    private int a=12;
    private String s = "Java bean class";

    public int getA(){
        return a;
    }
    public void setA(int a){
        this.a=a;
    }

    public String getS(){
        return s;
}
   public void setS(String s){
    this.s =s;
   }
   public static void main(String[] args) {
       program4 pr = new program4();
       System.out.println("A :"+pr.a);
       System.out.println("S :"+pr.s);
   }
}