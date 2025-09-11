

//     // Private static instance
//     private static Singleton instance;

//     // Private constructor
//     private Singleton() {
//         System.out.println("Singleton object created");
//     }

//     // Public static method to get instance
//     public static Singleton getInstance() {
//         if(instance == null) {
//             instance = new Singleton();
//         }
//         return instance;
//     }

//     // Example method
//     public void showMessage() {
//         System.out.println("Hello from Singleton!");
//     }
// }

// public class program3 {
//     public static void main(String[] args) {
        
//         // First time getInstance called → object create
//         Singleton s1 = Singleton.getInstance();
//         s1.showMessage();

//         // Second time getInstance called → same object return
//         Singleton s2 = Singleton.getInstance();
//         s2.showMessage();

//         // Check if both references point to same object
//         if(s1 == s2) {
//             System.out.println("Both are same instance");
//         }
//     }
// }


class Singleton{
    private static Singleton inst;

  public static Singleton getInst(){
  if(inst==null){
    inst=new Singleton();
  }
  return inst;
  }
  public void getmessage(){
    System.out.println("Single inst is created !.......");
  }
}

public class program3{
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInst();
        s1.getmessage();
        Singleton s2  = Singleton.getInst();
        s2.getmessage();
        if(s1==s2){
            System.out.println("Both method are same!'''''''");
        }
    }
}