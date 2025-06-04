class monitor{
    protected int a =23;
    protected double d = 34.67;
    public  boolean equals(Object o){
        monitor mt =(monitor)o;
        if(a==mt.a && d==mt.d){
            return true;
        }
        else{
            return false;
        }
    }
}

public class program12{
    public static void main(String[] args) {
        monitor m = new monitor();
        System.out.println(m.equals(m));
    }
}