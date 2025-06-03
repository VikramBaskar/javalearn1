
import java.io.File;

public class program10{
    public static void main(String[] args) {
        File ref = new File("D:/FILEIO");
         boolean status = ref.exists();
        if(status==false){
          ref.mkdir();
                System.out.println("One file is created");
        }
        else{
            System.out.println("File Already Exits");
        }

    }
}