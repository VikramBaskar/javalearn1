 class program5{
    public static void main(String[] args) {
        
        String str = "Test";
        StringBuffer buffer= new  StringBuffer("Test");
        StringBuilder builder= new StringBuilder("Test");
        System.out.println(str);
        System.out.println(buffer);
        System.out.println(builder);
        str =str+"Automation";
        buffer.append("Automation");
        builder.append("Automation");
        System.out.println(str);
          System.out.println(buffer);
        System.out.println(builder);
            }
 }