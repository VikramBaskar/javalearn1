
import java.io.File;
import java.io.IOException;

class program11{
    public static void main(String[] args) {
        File fl = new File("D:/FILEIO/demo.txt");
        boolean status = fl.exists();
        if(status == false){
            try{
                 fl.createNewFile();
                System.out.println("A new file will created");
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        else{
            System.out.println("A File already exits");
        }
    }
}