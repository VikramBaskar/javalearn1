class NeedForSpeedException extends Exception{

}
class speed{
    public  final static  void topspeed(int sp)throws NeedForSpeedException{
        if(sp>60){
            throw new NeedForSpeedException();
        }
    }
}
final class program11{
    public static void main(String[] args) {
        try{
            speed.topspeed(23);
            speed.topspeed(89);
        }catch(NeedForSpeedException e){
            e.printStackTrace();
        }
    }
}