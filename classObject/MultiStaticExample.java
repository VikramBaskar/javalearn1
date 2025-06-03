public class MultiStaticExample {
     {
        System.out.println("Static block 1");
    }

     {
        System.out.println("Static block 2");
    }

     {
        System.out.println("Static block 3");
    }

    public static void main(String[] args) {

       
        MultiStaticExample m = new MultiStaticExample();
         System.out.println("Inside main method");
       // System.out.println(m);

    }
}
