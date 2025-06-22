// static method
class program27{
    static int a=12;
    static{
        a=11;
    }
    static {
        a=34;
    }
    public static void main(String[] args) {
        System.out.println(program27.a);
    }
}