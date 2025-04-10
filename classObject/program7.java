public class program7 implements Cloneable{
    int radius = 5;
    String color = "pink";
    protected Object clone()throws CloneNotSupportedException{
        System.out.println("This is clone()");
         return super.clone();
    }

    public static void main(String[] args)  {
        program7 ori = new program7();
        ori.radius= 23;
        ori.color="blue";
        program7 replica =(program7)ori;
        System.out.println(replica.equals(ori));
        System.out.println(replica.radius);
        System.out.println(replica.toString());
    }
}