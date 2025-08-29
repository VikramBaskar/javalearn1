
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//Ascending or any order
class collection2{
    public static void main(String[] args) {
        List<String> st =new ArrayList<>();
        st.add("sdjfn");
        st.add("iuergyuehrf");
        st.add("aed");
        st.add("sldnckjldsnckdj");
        st.add("qw");
        st.stream()
        .distinct()
        // .sorted((elem1,elem2)-> elem2.compareTo(elem1))   //order arrangement
        .map(word -> word.toUpperCase())
        .forEach(System.out:: println);

    }
}