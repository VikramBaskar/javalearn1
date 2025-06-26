//method overloading

class coop{
    public void test(){
        System.out.println("coop to find");
    }
    public void test(int a){
        System.out.println("coop to access");
    }
    public void test(String s){
        System.out.println("Coop to String");
    }
}
class program35{
    public static void main(String[] args) {
        coop c= new coop();
        c.test();
        c.test(2);
        c.test("hi");
    }
}