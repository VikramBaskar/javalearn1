
import java.util.ArrayList;
import java.util.List;

class ArrayListDemo{
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(50);
        al.add(30);
        al.add(40);
       // System.out.println(al);
       System.out.println( al.add(70));
        //System.out.println(al);
        al.add('a');
        al.add(true);
        al.add(2.3);
        al.add("String");
        al.add(4,"vishnu");
        System.out.println(al);
       // al.remove(4);
       // System.out.println(al);
      //  System.out.println(al.contains("String"));
        //System.out.println(al.size());
       // System.out.println(al.get(0)+" "+al.get(2));
       // System.out.println(al.add(al));
       // al.clear();
      //  System.out.println(al);
        al.set(5, "vikram");
        System.out.println(al);
       
        System.out.println( al.indexOf("vikram"));
       // System.out.println(al.addAll(al));
        ArrayList al1 = new ArrayList();
        al1.addAll(al);
        System.out.println("The Adding a new value is !..."+al1);
        al1.addAll(6, al);
        System.out.println(al1);
        // al1.set(2, al);
        // System.out.println(al1);
        System.out.println(al1.get(3));

        ArrayList al2 =new ArrayList();
        al2.add("Chennai");
        al2.add("kerala");
        al2.add("Andhra");
        al2.add("Karnataka");
        al2.add("Hydrabad");
        System.out.println("al2 list is :"+al2);

       List al3 = al2.subList(0, 5);
     System.out.println(al3);  
     List al4 = al2.subList(3,5);
       System.out.println(al4);       
     }
}