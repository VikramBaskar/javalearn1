
//constructor overloading without inilize passing arugument it take default calling statement after called statement

class city{
    city(){
        System.out.println("Chennai");
    }
    city(double d){
        System.out.println("Villupuram");
    }
    city(String s){
        System.out.println("Coimbuture");
    }
}
public class programcod1{
    public static void main(String[] args) {
        city c = new city(1.2);
        city q = new city(2);
        city w = new city("asd");
        //city a = new city();
    }
}