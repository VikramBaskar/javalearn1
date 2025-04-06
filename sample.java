public class sample {  // ✅ Class name should start with an uppercase letter (best practice)
    private int a, b;  // ✅ Instance variables to store values

    // Constructor to initialize values
    public sample(int a, int b) {  
        this.a = a;
        this.b = b;
    }

    // Method to calculate the sum
    public void area() {  // ✅ No parameters needed since values are already stored
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        sample obj = new sample(1, 3);  // ✅ Using the constructor to initialize values
        obj.area();  // ✅ Calling method without parameters
    }
}
 