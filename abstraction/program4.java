
import java.util.Scanner;

interface Animal{
    void noise();
}

class Dog implements Animal{
   public void noise(){
        System.out.println("Bow Bow !......");
    }
}
class Cat implements Animal{
   public void noise(){
        System.out.println("meow meow !......");
    }
}
class Lion implements Animal{
   public void noise(){
        System.out.println("Roar Roar !.......");
    }
}

class AnimalStimulate{
    public static void makenoise(Animal a){
        if(a!=null){
            a.noise();
        }
    }
    public static Animal createAnimal(String s){
        if(s.equalsIgnoreCase("Dog"))
        return new Dog();
        else if(s.equalsIgnoreCase("Cat"))
        return new Cat();
        else if(s.equalsIgnoreCase("Lion"))
        return new Lion();
        else
        return null;
    }
}

class program4{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Animal Name");
        String name = scn.next();
        Animal a =  AnimalStimulate.createAnimal(name);
        AnimalStimulate.makenoise(a);
    }
}