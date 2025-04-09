//constructor Overloading
class hotel{
hotel(int a){
    System.out.println("KFC");
}
hotel(Double d){
    System.out.println("Mc Donlad");
}
hotel(String s){
    System.out.println("Popyee");
}
}
public class overloadconstructor{
    public static void main(String[] args) {
        hotel h1 = new hotel(2.3);
        hotel h2 = new hotel(1);
        hotel h3 =new  hotel("hi");
    }
}