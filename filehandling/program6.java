
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class  program6{
    public static void main(String[] args) {
        FileWriter ref = null;
        File fu =new File("E:/thiruma.pdf");
        
        boolean check = fu.exists();
        if(check ==false){

            try {
                fu.createNewFile();
                
                System.out.println("A new pdf file created!---");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(check == true){
            
            fu.delete();
            System.out.println("A pdf file has deleted");
        }
    }
}