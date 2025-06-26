class sample{

    public sample(int a) {
        System.out.println("Table fan");
    }
     
     public sample(double d){
        System.out.println("wall mounted fan");
     }
     public sample(String s){
        System.out.println("Celing fan");
     }
}
public class program34{
    public static void main(String[] args) {
        sample s= new sample(2.3);
        sample w =new sample(1);
        sample st =new sample("hi");
    }
}