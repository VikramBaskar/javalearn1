
import java.util.function.Predicate;

class predicate{
  public static void main(String[] args) {
      int[] ar={10,2,3,4,5,6,7,8,12,13};
      Predicate<Integer> p1=no->no%2!=0;
      Predicate<Integer>p2=no -> no<10;
    //   for(int i=0;i<ar.length;i++){
    //     System.out.println(p1.test(ar[i]));
    //   }

    //   check(p1.negate(),ar);

    //   check(p1.and(p2),ar);
      check(p1.or(p2), ar);
  }

    private static void check(Predicate<Integer> p1, int[] ar) {
        //  for(int i=0;i<ar.length;i++){
        // System.out.println(p1.test(ar[i]));

    for(int i=0;i<ar.length;i++){
        boolean result=p1.test(ar[i]);
        if(result)
        System.out.println(ar[i]);
    }
      }
        // throw new UnsupportedOperationException("Not supported yet.");
    }
