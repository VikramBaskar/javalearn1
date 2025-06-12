
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

class program19{
    public static void main(String[] args) {
        String filename="Tamil.txt";

        try{
            File file =new File(filename);
            if(file.createNewFile()){
                System.out.println("File Created :"+ file.getName());
            }
            else{
                System.out.println("File Already exists");
            }
        }catch(IOException e){
                System.out.println("A Error Occured During File Created !......");
        e.printStackTrace();
        }

        try {
            FileWriter writer=new FileWriter(filename);
            writer.write("கிங்பிஷர் ஏர்லைன்ஸ் நிறுவனத்தை நடத்திய தொழிலதிபர் விஜய் மல்லையா, பல்லாயிரம் கோடி ரூபாய் கடன் ஏற்பட்ட நிலையில் இந்தியாவை விட்டு தப்பி ஓடினார். பிரிட்டனில் தஞ்சம் புகுந்துள்ள அவர், இந்தியா வந்தால் கைது செய்யப்படுவோம் என்ற அச்சத்தில் தொடர்ந்து அங்கேயே வசித்து வருகிறார்.\n");
            writer.write("இந்நிலையில், அவரது நிறுவனங்கள் சார்பில் பெறப்பட்ட கடனுக்காக, உத்தரவாதமாக தரப்பட்டிருந்த அவரது சொத்துக்கள் ஏலத்தில் விடப்பட்டன. இதன் மூலம் அவர் பெற்றிருந்த கடன் தொகையின் ஒரு பகுதி அடைக்கப்பட்டு விட்டது. இந்நிலையில் லண்டனில் சமீபத்தில் பேட்டி அளித்த விஜய் மல்லையா, பல்வேறு குற்றச்சாட்டுகளை தெரிவித்தார்.");
            writer.close();
            System.out.println("Successfully file has writed");


        } catch (Exception e) {
            System.out.println("An Error Occures");
            e.printStackTrace();
        }

        try {
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filename),"UTF-8"));
            String line;
            System.out.println("Reading the file content");
            while((line=reader.readLine() )!=null)   {
              System.out.println(line);
            }   
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}