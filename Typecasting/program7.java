class remote{
    void plastic(){
        System.out.println("Remote madeup with plastic");
    }
}
class button extends remote{
    void metal(){
        System.out.println("Button madeup of metal!....");
    }
}
public class program7{
    public static void main(String[] args) {
        remote r = new button();
        r.plastic();
        button b = (button)r;
        b.metal();
    }
}