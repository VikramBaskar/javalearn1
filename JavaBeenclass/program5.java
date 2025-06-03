
import java.io.Serializable;

class program5 implements Serializable{
    private int i;
    private double d;

    public int getI(){
        return i;
    }
    public void setI(int I){
        this.i=i;
    }
    public double getD(){
        return d;
    }
    void setD(double d){
        this.d = d;
    }

    public static void main(String[] args) {
        program5 p =new program5();
        System.out.println("I : "+p.i);
        System.out.println("D : "+p.d);
    }
}