//upcasting 

class apple {
    void alpha(){
        System.out.println("running alpha from apple");
    }
}

class ball extends apple {
    void beta(){
        System.out.println("running beta from ball");
    }
}

public class program2{
    public static void main(String[] args) {
        ball b = new ball();
        b.alpha();
        b.beta();
        apple a = b;
        a.alpha();
        
    }
}