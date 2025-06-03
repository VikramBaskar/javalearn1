
import java.io.File;

class program5{
    public static void main(String[] args) {
        File fl =new File("E:/FileDEmo/filedemo.txt");
        boolean status = fl.exists();
         if(status == false){
            try {
                fl.createNewFile();
                System.out.println("A New File  Is Created");
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
         else{
            System.out.println("Already Exists");
         }
    }
}