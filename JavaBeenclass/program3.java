
import java.io.Serializable;

class student implements Serializable{
    private int Id;
    private float f;
    public int getId(){
        return Id;
    }
    void setId(int Id){
        this.Id= Id;
    }
    public float getf(){
        return f;
    }
    void setf(float f){
        this.f=f;
    }
}
public class program3{
    public static void main(String[] args) {
        student sd = new student();
        sd.setf(123.2344f);
        sd.setId(1);
        System.out.println("Float value :"+sd.getf());
        System.out.println("Id value :"+sd.getId());

    }
}