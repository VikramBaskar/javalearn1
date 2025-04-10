
//Try and catch block
public class program2{
    public static void main(String[] args) {
        System.out.println("Program Starts!.....");
        String str = "Automatic";
        try {
          System.out.println(str.charAt(19));  
        } catch (NullPointerException e) {
            System.out.println("Dai : Null reference Operation");
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("Alert : Invalid index");
        }
        System.out.println("Program Ends");
    }
}