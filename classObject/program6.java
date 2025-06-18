// finilize method
class Connection implements AutoCloseable {
    public void open() {
        System.out.println("Connection opened.");
    }

  //  @Override
    public void close() {
        System.out.println("Resources cleared using close().");
    }
}

public class program6 {
    public static void main(String[] args) {
        try (Connection c = new Connection()) {
            c.open();
        }
    }
}
