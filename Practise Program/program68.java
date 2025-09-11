interface  Newtech{
  void  qtech();
}
abstract class Oldtech{
    abstract  void java();
    abstract  void python();
    int a =10;
    public void sql(){
        System.out.println("Leaning sql squries");
    }
}

class midtech extends Oldtech{
    void java(){
        System.out.println("Learning java code ");
    }
    void python(){
        System.out.println("learning python code ");
    }
}

class program68 extends midtech implements Newtech{
      public void  qtech(){
        System.out.println("quatortech !------");
    }
    public static void main(String[] args) {
            Oldtech od =new midtech();
        od.java();
        od.python();
        System.out.println(od.a);

        // Newtech nt  = new quatortech();
        // nt.qtech();
    }
}