
import java.io.File;
import java.io.IOException;

 class program1{
    public static void main(String[] args){
       File ref =new File("D:/Javascript/demo.txt");
        boolean status = ref.exists();
        if(status ==false){
            try {
                ref.createNewFile();
                System.out.println("File Created");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else{
            System.out.println("File Already Exits");
        }
    }
 }