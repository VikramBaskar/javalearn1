
import java.util.ArrayList;

class program2{
    public static void main(String[] args) {
        ArrayList<Object> a1 = new ArrayList<>();

        a1.add(1);
        a1.add(true);
        a1.add('A');
        a1.add("asd");
        a1.add(1.2);
        a1.add(1.234f);

        System.out.println(a1);
        for(int i=0;i<a1.size();i++){
            Object obj = a1.get(i);
            if(obj instanceof Integer){
                System.out.println(obj);
            }
        }

    }
}