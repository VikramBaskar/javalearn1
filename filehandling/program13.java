
import java.io.FileWriter;
import java.io.IOException;

class program13{
    public static void main(String[] args) {
      FileWriter fil = null;
      try{
        fil =new FileWriter("D:/FILEIO/demo.txt");
         fil.write("VIkram");
         fil.write("\n");
         fil.write("\n");
         fil.write("jhbhjbhbd");
         fil.flush();
         System.out.println("Write completed");
      }catch(IOException e){
        e.printStackTrace();
      }
      finally{
        try{
            fil.close();
        }catch(IOException e){
            e.printStackTrace();
        }
      }
    }
} 