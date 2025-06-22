class program12{
    int a;

    public program12(int s) {
        a=s;

    }

    public program12(program12 obj) {
        a =obj.a;
    }
    public static void main(String[] args) {
        program12 pr= new program12(10);
        System.out.println(pr.a);
        program12 p = new program12(23);
        System.out.println(p.a);
    }
    
    
}