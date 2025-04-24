
//without using this operator
class laptop{
    int s;
    String sd;
    laptop(int a, String w){
        s=a;
        sd=w;
    }
}
class program10{
    public static void main(String[] args) {
        laptop l=  new laptop(07, "vikram");
        System.out.println("Id :"+l.s +" "+"Name :"+l.sd);
    }
}