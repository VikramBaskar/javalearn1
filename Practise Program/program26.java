
import java.util.ArrayList;
import java.util.Collections;


class program26{
 public static void main(String[] args) {
     ArrayList<String> st = new ArrayList<>();
     st.add("12");
     st.add("89");
     st.add("45");
     st.add("78");
     System.out.println(st);
     Collections.sort(st);
     System.out.println(st);

     Collections.sort(st,Collections.reverseOrder());
     System.out.println(st);
 }
}