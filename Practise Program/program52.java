
import java.util.Arrays;

class program52{
    public static void main(String[] args) {
        String[] st ={"1","2","3","4","5"};
        int max = Arrays.stream(st)
                .mapToInt(Integer::parseInt)
                .max()
                .getAsInt();
                System.out.println(max+" ");
    }
}