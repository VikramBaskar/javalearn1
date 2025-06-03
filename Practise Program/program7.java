
import java.io.File;

class program7{
    public static void main(String[] args) {
        File fw =new File("E:/FileDEmo/filedemo.txt");
        boolean Status =fw.exists();
        if(Status == true){
            try {
                fw.delete();
                System.out.println("Existing file was deleted");
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        else{
            System.out.println("No more files !.....");
        }
    }
}