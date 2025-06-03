
import java.io.FileInputStream;
import java.io.ObjectInputStream;

class program2{// Deserilazation
 public static void main(String[] args) throws Exception {
     FileInputStream fis =new FileInputStream("D:/FILEIO/demo.txt");
     ObjectInputStream ois =new ObjectInputStream(fis);
     program1 pr = (program1)ois.readObject();
     System.out.println(pr.hisscore);
 }
}