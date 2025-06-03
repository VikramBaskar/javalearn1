
import java.io.File;


class program4{
    public static void main(String[] args) {
        File fil = new File("E:/FileDEmo");
        boolean status = fil.exists();
        if(status == false){
            fil.mkdir();
            System.out.println("The File has Created ...");
        }
        else{
            System.out.println("File Alredy exits!.....");
        }
    }
}