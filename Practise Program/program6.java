
import java.io.FileWriter;
class program6{
    public static void main(String[] args) {
        FileWriter Fwr = null;
        try {
            Fwr =new FileWriter("E:/FileDEmo/filedemo.txt");
            Fwr.write("New line written in filedemo file");
            Fwr.write("\n");
             Fwr.write("New next line written in filedemo file");
            Fwr.flush();
            System.out.println("Written Completed");

        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            try {
                Fwr.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}