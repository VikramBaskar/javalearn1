class employee{
    int a;
    Double d;
    employee(int a, Double d){
        this.a=a;
        this.d= d;
    }
}
public class program9{
    public static void main(String[] args) {
        employee em = new employee(1, 1.2);
        System.out.println("Rate :"+em.a+ " "+"points : "+em.d);
    }
}