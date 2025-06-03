interface noise{
    void sounds();
      void loud();
}

interface clam{
    void silent();
    abstract void veryclam();
}
abstract class pollution implements noise,clam{
   public  void sounds(){
        System.out.println("dfsdsd");
    }
}

// class polute implements noise{
  
//     public void loud(){
//         System.out.println("polution noise");
//     }
// }
// class largesound implements clam,noise{
//     @Override
//     public void veryclam(){
//         System.out.println("Clam sound produce");
//     }
// }

class program4{
    public static void main(String[] args) {
      //  largesound lg = new largesound();
        //   lg.loud();
        //   lg.sounds();
        
    

    }
}