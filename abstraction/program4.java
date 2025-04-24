
import javax.lang.model.util.ElementScanner14;

// 100% multiple inheritance and interface class
interface Animal{
    void noise();
}
class Dog implements Animal{
    public void noise(){
        System.out.println("Bow Bow");
    }
}
class cat implements Animal{
    public void noise(){
        System.out.println("Meow Meow");
    }
}
class Lion implements Animal{
    public void noise(){
        System.out.println("Roar Roar");
    }
}
class AnimalSimulator{
    public static void makenoise(Animal a){
        if(a != null){
            a.noise();
        }
    }

public static Animal createAnimal(String S){
    if(S.equalsIgnoreCase("Dog"))
    return new Dog();
    else if(S.equalsIgnoreCase("cat"))
    return new cat();
    else if(S.equalsIgnoreCase("Lion"))
    return new Lion();
    else
    return null;
}
}
public class program4{
    public static void main(String[] args) {
        
        Scanner scn =new Scanner(System.in);
        System.out.println("Enter the Animal name");
        String name =scn.next();
        Animal a;
        a =AnimalSimulator.createAnimal(name);
        AnimalSimulator.makenoise();
    }
}
