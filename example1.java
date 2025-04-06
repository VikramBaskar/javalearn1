class example1{
    String s ="Compact";
    static Double d =2.12;
    void push(){

        System.out.println("Executing Push().....");
    }
     void Send(){
      System.out.println("Executing Send().....");
    }
    public static void main(String[] args) {
        System.out.println(example1.d);
        example1 e = new example1();
        e.push();
        e.Send();
    }

}