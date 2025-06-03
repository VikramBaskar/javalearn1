
import java.util.LinkedList;

class LinkedListDemo{
    public static void main(String[] args) {
        
        LinkedList ll = new   LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        System.out.println(ll);
        ll.addFirst(0);
        System.out.println(ll);
        ll.addLast(5);
        System.out.println(ll);
         ll.add(true);
         ll.add("balan");
         ll.add(3.56);
          System.out.println(ll);
          System.out.println("Before poll :"+ll);
          System.out.println(ll.poll());
          System.out.println("After poll :"+ll);

          ll.offer(2000);
          System.out.println("After offer :"+ll);
           
          LinkedList ll1 = new LinkedList();
        
    }
}  