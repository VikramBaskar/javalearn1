
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class program4 implements Serializable{
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("D:/FILEIO/demo.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        program3  p=(program3)ois.readObject();
        System.out.println(p.a);
    }
}