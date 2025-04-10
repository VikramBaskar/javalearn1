class product{
    private int a =23;
    private double d =1.2;

    public boolean equals(Object o){
        product pr =(product)o;
        a=10;
        
        if(a == pr.a || d == pr.d){
            return true;
        }
        else{
            return false;
        }
    }

}
public class program4{
public static void main(String[] args) {
    product p1 = new product();
    product p2 =new product();
    System.out.println(p1.equals(p2));
}
}