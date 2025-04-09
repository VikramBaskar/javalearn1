import java.io.Serializable;

public class program1 implements Serializable {
    private int id = 10;
    private double d = 2.1;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public static void main(String[] args) {
        program1 obj = new program1();
        System.out.println("ID: " + obj.getId());
        System.out.println("D: " + obj.getD());
    }
}
