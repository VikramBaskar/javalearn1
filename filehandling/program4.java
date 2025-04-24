
//creating and deleting file in defined path

import java.io.File;
import java.io.IOException;

 class program4{
    public static void main(String[] args) {
        File full =new File("E:/bluebird.png");
        boolean check = full.exists();
        if(check==false){
            try {
                 full.createNewFile();
          System.out.println("An png file has created");
            } catch (IOException e) {
            }
         
        }
        else if(check == true){
            full.delete();
            System.out.println("An png file has deleted");
        }
        else  {
            System.out.println("File already exits");
        }

    }
 }