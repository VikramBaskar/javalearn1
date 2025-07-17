
import java.util.Arrays;

class program48{
    public static void main(String[] args){
        String[] as ={"12","23","45","56","67","78"};
                int num =Arrays.stream(as)
                        .mapToInt(Integer::parseInt)
                        .max()
                        .getAsInt();
                        System.out.println("Maximum: "+num);
    }
}