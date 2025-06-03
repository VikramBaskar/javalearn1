public class MySingleton {
    // Step 1: Create a static instance of the class
    private static MySingleton instance = new MySingleton();

    // Step 2: Make the constructor private so no one can create objects
    private MySingleton() {}

    // Step 3: Provide a public method to return the instance
    public static MySingleton getInstance() {
        return instance;
    }

    // Example method
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}
