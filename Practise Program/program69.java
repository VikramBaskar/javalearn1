interface Song{
   static void goodSong(){
        System.out.println("Hi Song");
    }
}

interface music{
   static void goodSong(){
    System.out.println("Hi music");
   }
}

class program69 implements Song,music{
    void program(){
        System.out.println("Good pro");
    }
    public static void main(String[] args) {
        
        program69 pr =new program69();
         Song .goodSong();
        music.goodSong();
          pr.program();
    }
}