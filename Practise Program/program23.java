class program23{
    int a;
    double d;
    void program23(){
        System.out.println("Default Constructor");
    }
    public static void main(String[] args) {
        program23 p = new program23();
        System.out.println(p.a);
        System.out.println(p.d);
        p.program23();

    }
}