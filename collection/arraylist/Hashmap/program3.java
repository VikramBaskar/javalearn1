
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class program3{
    public static void main(String[] args) {
        Map<String, Integer>marks = new HashMap<>();
        marks.put("Science", 56);
        marks.put("Physics", 89);
        marks.put("maths", 67);
        marks.put("Language", 78);
        marks.put("EVS", 78);
        System.out.println(marks);

           Set <String> subjects = marks.keySet();

           for(String Subject : subjects){
            System.out.println(Subject+" : "+marks.get(Subject ));
           }
    }
}