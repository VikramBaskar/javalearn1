
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person implements Comparable<Person> {
    private int age;

    public Person(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person p) {
        if (this.age > p.age) return -1;  // descending order
        else if (this.age < p.age) return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Age: " + age;
    }
}


public class program8 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person(25));
        list.add(new Person(25));
        list.add(new Person(20));
        list.add(new Person(45));

        Collections.sort(list); // Sorts using compareTo

        for (Person p : list) {
            System.out.println(p);
        }
    }
}
