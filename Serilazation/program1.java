
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
// Serilazation
class program1 implements Serializable{
     int hisscore;  
     public void demo(){
      System.out.println("ho");
     }
    public static void main(String[] args) {
   program1 pr  = new program1();
   pr.demo();
   pr.hisscore=2344;
   try{
    FileOutputStream fos = new FileOutputStream("D:/FILEIO/demo.txt");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(pr);
      System.out.println("Serilazation Completed");
      oos.close();
      fos.close();
   }catch(IOException e){
    e.printStackTrace();
   }
      
    }
}