//non static block
class program28{
    int a=12;
     
    {
        a=23;
    }
    {
        a=78;
    }
    public static void main(String[] args) {
        program28 p =new program28();
        System.out.println(p.a);
        p.a=44;
        System.out.println(p.a);
    }
}