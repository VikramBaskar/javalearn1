class Cake implements AutoCloseable{
    public String open(){
        return "hi";
    }
    @Override
    public void  close(){
        System.out.println("close methods @.......");
    }
}

public class program15{
    public static void main(String[] args) {
        try(Cake c = new Cake()){
        System.out.println(c.open());
        }
    }
}