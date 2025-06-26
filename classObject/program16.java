class demo{

}
class sample extends demo{
   public String toString(){
        return "good";
    }
    
}
class program16{
    public static void main(String[] args) {
        demo d =new demo();
        sample s =new sample();
        System.out.println(s.toString());
        System.out.println(d.toString());
    }
}