interface animal {
    void noise();
}

interface lion {
    void sound();  // correct method name
}

class tiger implements animal, lion {
    public void noise() {
        System.out.println("animal sound");
    }
    public void sound() {  // method name fixed!
        System.out.println("lion sound");
    }
}

public class program2 {
    public static void main(String[] args) {
        tiger t = new tiger();
        t.noise();  // prints: animal sound
        t.sound();  // prints: lion sound
    }
}
