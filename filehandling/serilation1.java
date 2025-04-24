
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class serilation1 implements Serializable{
    int hisccore;
    public static void main(String[] args) {
        try {
     
         
        serilation1 ref = new serilation1();
        
        ref.hisccore = 5000;
        FileOutputStream fos = new FileOutputStream("E:/vik.txt");
        ObjectOutputStream oos =new ObjectOutputStream(fos);
        oos.writeObject(ref);
        System.out.println("Serilazation completed");
        oos.close();
        fos.close();
               
        } catch (Exception e) {
            e.printStackTrace();
        }
         
    }
}