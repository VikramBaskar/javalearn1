class test1{
    void debug(){
        System.out.println("debugging...");
    }
    
}

class test2{
    test1 t = new test1(); 
}

public class program2{
public static void main(String[] args) {
    test2 t = new test2();
    t.t.debug(); 
}
}