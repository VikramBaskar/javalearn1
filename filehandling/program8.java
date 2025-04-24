
import java.io.FileReader;
import java.io.IOException;

class  program8{
    public static void main(String[] args) {
        FileReader ref =null;
        try {
            ref =new FileReader("E:/vik.txt");
            int val = ref.read();
            while(val != -1){
                System.out.println((char)val);
                val = ref.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}