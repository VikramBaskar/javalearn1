
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class program3 implements Serializable{
    int a=1233;
    public void detial(){
        System.out.println("program Starts!......");
    }
    public static void main(String[] args) throws Exception {
        program3 pr=  new program3();
        System.out.println("Program object created");
        FileOutputStream fos = new FileOutputStream("D:/FILEIO/demo.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(pr);
        oos.close();
    }
}