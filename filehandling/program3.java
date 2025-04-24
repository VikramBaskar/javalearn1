
import java.io.File;
import java.io.IOException;

 class program3{
    public static void main(String[] args) {
        File fil = new File("E:/thiruma.pdf");
        boolean present =fil.exists();
        if(present == false){
            try {
                fil.createNewFile();
                System.out.println("A new pdf file created");
            } catch (IOException e) {
            }
        }
        else{
            System.out.println("file already found");
        }
    }
 }