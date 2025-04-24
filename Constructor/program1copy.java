class Side{
    int side;
    Side (int s){
        side =s;
    }
    Side(Side obj){
        side = obj.side;
    }
    void display(){
        System.out.println("Side value is : "+side);
    }
}
public class program1copy{
    public static void main(String[] args) {
        Side s1 =new Side(5);
        s1.display();
        s1.display();

    }
}