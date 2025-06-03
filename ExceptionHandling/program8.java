class program8{
    public static void main(String[] args) {
        System.out.println("Program Starts");
           String str ="LaptopCompany";
           try {
               System.out.println(str.charAt(32));
           } catch (NullPointerException e) {
            System.out.println("Dei : Null pointer exception");
           }catch(StringIndexOutOfBoundsException e){
            System.out.println("Invalid index");
           }

    }
 
}