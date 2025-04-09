//constructor chaining this operator 
class hotel{

     hotel(int a) {
        System.out.println("KFC!....");
    }
    hotel(double  a){
           this(23);
        System.out.println("MC donald");
     
    }

     hotel(String b) {
        this(12.2);
        System.out.println("Burgar king");
    }
    
}
public  class program1{
    public static void main(String[] args) {
        hotel h1  = new hotel("sdfdf");
      
    }
}