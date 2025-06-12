
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;



class program20{
    public static void main(String[] args) {
        String filetext = "E:/tamil.txt";
        
        try {
            BufferedReader reader= new BufferedReader(new InputStreamReader(new FileInputStream(filetext),"UTF-8"));
            String line;
            System.out.println("Reading File Content:");
            while ((line=reader.readLine())!=null) {
                System.out.println(line); 
            }
            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}