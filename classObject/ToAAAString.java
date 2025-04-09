class Alpha{

}

class beta {
    
    public String toString(){
        return "abc";
    }
}

public class ToAAAString{

    public static void main(String[] args) {
        
   
    Alpha c = new Alpha();
    beta b = new beta();

    
    System.out.println(b.toString());
    System.out.println(c.toString());
    System.out.println(c.hashCode());
    
     }

}