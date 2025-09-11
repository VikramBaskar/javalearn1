import java.util.ArrayList;

public class program2 {
    public static void main(String[] args) {
        // Create an array of ArrayList objects
        ArrayList<String>[] listArray = new ArrayList[3];

        // Initialize each ArrayList
        for (int i = 0; i < listArray.length; i++) {
            listArray[i] = new ArrayList<>();
        }

        // Add elements to each ArrayList
        listArray[0].add("Apple");
        listArray[0].add("Banana");
        listArray[0].add("Avacado");

        listArray[1].add("Carrot");
        listArray[1].add("Beetroot");

        listArray[2].add("Dates");
        listArray[2].add("Fig");

        // Print the elements
        for (int i = 0; i < listArray.length; i++) {
            System.out.println("List " + i + ": " + listArray[i]);
        }
    }
}
