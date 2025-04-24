
import java.io.FileInputStream;
import java.io.ObjectInputStream;

class serilationde{
    public static void main(String[] args)throws Exception {
        try {
            
     
        FileInputStream fis =new FileInputStream("E:/vik.txt");
        ObjectInputStream ois =new ObjectInputStream(fis);
        serilation1 ref1 = (serilation1)ois.readObject();
        System.out.println(ref1.hisccore);
           } catch (Exception e) {
            e.printStackTrace();
        }

    }
}