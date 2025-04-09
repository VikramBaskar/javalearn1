

class parent{
    void watchtv(){
        System.out.println("Watching news and serials");
    }
}
class child extends parent{
    void watchtv(){
        System.out.println("Watching songs and cartoon");
    }
}
public  class program1{
    public static void main(String[] args) {
        parent p  =new parent();
        p.watchtv();
        child c=  new child();
        c.watchtv();

        parent pr = new child();
        pr.watchtv();
    }
}