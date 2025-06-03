public class Circle implements Cloneable{
    int radius =2;
    String color = "white";
    public static void main(String[] args) throws CloneNotSupportedException {
        Circle cr =new Circle();
        cr.radius =3;
        cr.color = "blue";
        Circle replica =(Circle)cr.clone();
        System.out.println(replica.color);
        System.out.println(replica.radius);
    }
}