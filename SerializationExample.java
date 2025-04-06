
    import java.io.*;

class program8 implements Serializable {
    String name;
    int age;

    program8(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class SerializationExample  {
    public static void main(String[] args) {
        try {
            program8 student = new program8("John", 22);

            // Creating output stream
            FileOutputStream fileOut = new FileOutputStream("student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            // Serializing the object
            out.writeObject(student);
            out.close();
            fileOut.close();
            System.out.println("Object has been serialized");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

