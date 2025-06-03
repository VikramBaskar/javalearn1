
import java.io.File;


class program12{
    public static void main(String[] args) {
        File fe = new File("D:/FILEIO/demo.txt");
        boolean status = fe.exists();
        if(status == true){
            try{
                fe.delete();
                System.out.println("Exits file can be deteted !....");
            }finally{
                System.out.println("File Already deleted");
            }
            }
        }
    }