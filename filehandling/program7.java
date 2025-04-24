
import java.io.FileWriter;
import java.io.IOException;

 class program7{
    public static void main(String[] args) {
        FileWriter fil = null;
        try {
            fil =new FileWriter("E:/vik.txt");
            fil.write("Hi this is thiruma PDF");
            fil.write("\n");
            fil.write("A new line has written");
            fil.flush();
            System.out.println("Written Completed@!...");

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            try {
                fil.close();
            } catch (IOException e) {
                e.printStackTrace(); 
            }
        }
    }
 }