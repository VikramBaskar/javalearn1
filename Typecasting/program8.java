class play{
  void play(){
    System.out.println("Playing");
  }
}
class ground extends play{
    
    void ground(){
        System.out.println("gronud to play");
    }
}
class program8{
    public static void main(String[] args) {
        ground g = new ground();
        g.play();
        g.ground();
        play a =g;//upcasting
        a.play();
    }
}