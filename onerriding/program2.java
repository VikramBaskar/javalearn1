 class one{
    static  int a=12;
    static  void reply(){
        System.out.println("one reply");
    }
}
class two extends one{
  static  void reply(){
        System.out.println("Two reply");
    }
}
class program2{
    public static void main(String[] args) {
        one o =new one();
        o.reply();
        two t = new two();
        t.reply();
        one ot = new two();
        ot.reply();
       System.out.println(ot.a);
    }
}