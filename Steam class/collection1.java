
import java.util.ArrayList;
import java.util.List;

class collection1{
    public static void main(String[] args) {
        List<Integer> l =new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(25);
        l.add(30);
        l.add(10);
        l.add(20);

        l.stream().distinct().sorted()
        .forEach(n->System.out.println(n));
    }
}