
import java.util.function.Function;

class function_class{
    public static void main(String[] args) {
        Function<String,Integer>f = name ->name.length();
        System.out.println(f.apply("vikraman")); 

         int[] numb ={1,2,3,4,5};
         for(int n:numb){
            System.out.println(n);
         }
     }
}