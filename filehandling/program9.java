
import java.io.FileReader;

class program9{
    public static void main(String[] args) {
        FileReader fr =null;
        try {
            fr = new FileReader("E:/vik.txt");
             int val =fr.read();
             while(val != -1){
              System.out.println((char)val);
              val= fr.read();
             }
        } catch (Exception e) {
        }
    }
}