//constructor

class program29{
    
    int a=12;

    public program29() {
        //a=19;
        System.out.println("Constructor");
    }
    public static void main(String[] args) {
        program29 pr = new program29();
        System.out.println(pr.a);
    }
    
}