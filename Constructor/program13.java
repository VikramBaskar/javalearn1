class program13{
private   int a;
    public program13(int s,double d) {
         a=s;
      }

    public program13(program13 c) {
        a=c.a;
    }
    
    public static void main(String[] args) {
        program13 p= new program13(12,1.2);
        program13 ar = new program13(p);
        System.out.println(p.a);
    }
}