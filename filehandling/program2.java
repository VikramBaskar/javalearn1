
import com.sun.source.doctree.AttributeTree;
import java.io.File;
import java.io.IOException;

 class program2{
    public static void main(String[] args) {
        File f1 = new File("E:/vik.txt");
        boolean boll = f1.exists();
        if(boll ==false){
                try {
                    f1.createNewFile();
                    System.out.println("A new file created ");
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
        else{
            System.out.println("A file already exits");
        }

    }
 }