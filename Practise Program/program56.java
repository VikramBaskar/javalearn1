
import java.util.Arrays;

class program56{
    public static void main(String[] args) {
        int[] gh ={1,2,3,4,6,8,9,0,9,7,5};
      int[] even=  Arrays.stream(gh)
        .filter(d -> d%2==0)
        .toArray();
        System.out.println("Even number : "+Arrays.toString(even));

        // .forEach(d -> System.out.println(Arrays.toString(d)));
        int[] odd= Arrays.stream(gh)
                    .filter(g ->g%2 !=0)
                    .toArray();
                    System.out.println("Odd number : "+odd);
        
    }
}