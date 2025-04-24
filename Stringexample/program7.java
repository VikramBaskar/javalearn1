 class program7{
    public static void main(String[] args) {
        String a= "12";
        System.out.println(a.toString());
        String s1 = new String("v");
        System.out.println(s1.hashCode());
        String a1 =new String("12");
        System.out.println(a1.equals(a));

        //compariable String....
        String str = "viaram";
        System.out.println(str.compareTo("Azar"));
        System.out.println(str.compareTo("vijay"));
        System.out.println(str.compareTo("vijay"));


    }
 }