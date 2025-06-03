
import java.util.ArrayList;

class ArrayListDemo1{
    public static void main(String[] args) {
        
        ArrayList al =new ArrayList<>();
        al.add(12);
        al.add(23);
       al.add(23); 
       al.add("Comp");
       System.out.println(al);
       System.out.println(al.size());
       al.set(1, "Pen");
        //System.out.println(al);
      //al.addAll(1, al);
      //  System.out.println(al);
        al.add(true);
        al.add(1.23);
          System.out.println(al);
        // al.add(al);
        // System.out.println(al);
        System.out.println(al.get(2));
        System.out.println(al.remove(1));
        System.out.println(al);
        System.out.println(al.indexOf(true));
        ArrayList al1 = new ArrayList();
        al1.addAll(al);
        System.out.println(al1);
        al1.add("chennai");
        al.add("banglore");
       
        System.out.println(al1);
         System.out.println(al);
         System.out.println(al1.addAll(5,al));
         System.out.println(al1);
         ArrayList al2 = new ArrayList(al1.subList(2, 5));

         System.out.println(al2);

    }
}