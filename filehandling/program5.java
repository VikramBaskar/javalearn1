
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;

 class program5{
    public static void main(String[] args) {
        FileWriter ref = null;
        
        try {
            ref =new FileWriter("E:/vik.txt");
            ref.write("AHUBHBBHJB");
            ref.write("\n");
            ref.write("alkdjadfn");
            ref.flush();    
            System.out.println("Write Completed");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            try {
                ref.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
 }