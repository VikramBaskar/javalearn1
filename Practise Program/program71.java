interface force{
    void pull();
    void push();
}

interface strength{
   default  void power(){
        System.out.println("More Powwwwwwer!......");
    }
    int a= 12;
}

class program71 implements force,strength{
    
    public void pull(){
        System.out.println("Pull it !.......");
    }
    public void push(){
        System.out.println("Push it !----------");
    }
        public static void main(String[] args) {
            program71 m  =new program71();
            m.power();
            m.pull();
            m.push();
            System.out.println(strength.a);
        }
}
