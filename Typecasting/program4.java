

class bus{
    void model(){
        System.out.println("Bus is running");
    }
    void fourwheeler(){
        System.out.println("bus is a sixwheeler");
    } 
    void toobig(){
        System.out.println("Bus is toobig");
    }
}
class car extends bus{
    void model(){
        System.out.println("Car is runnig");
    }

    void fourwheeler(){
        System.out.println("car is a fourwheeler");
    }

    void big(){
        System.out.println("car is big");
    }
    
}
class bike extends car{
    void fourwheeler(){
        System.out.println("Bike is a twowheeler");
    }
    void model(){
        System.out.println("Bike has more speed");
    }
    void notbig(){
        System.out.println("bike is notbig");
    }
}

public class program4{
    public static void main(String[] args) {
       
    bus bk = new bike();
    bk.model();
    
   bike bf =(bike)bk;
   bf.toobig();
   bf.big();
   bf.notbig();
   bf.fourwheeler();
   bf.model();
   
   
    

   
    
    

    
    }
}