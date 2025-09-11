 //comparable string method
 class program3{
    public static void main(String[] args) {
        String str = "dhanush";
        if(str=="200"){
                System.out.println("false");
        }
        System.out.println(str.compareTo("vijay"));
        System.out.println(str.compareTo("Ajith"));
        System.out.println(str.compareTo("dhanush"));
        System.out.println(str.compareTo("vikram"));


        String s1 = "apple";
String s2 = "apple";
String s3 = "banana";
String s4 = "Apple";

System.out.println(s1.compareTo(s2)); // 0
System.out.println(s1.compareTo(s3)); // negative (apple < banana)
System.out.println(s1.compareTo(s4)); 
    }

 }