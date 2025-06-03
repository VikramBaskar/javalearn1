class overSpeedException extends Exception{

}
class police{
    static void verifyspeed(int speed)throws overSpeedException{
        if(speed>80){
            throw new overSpeedException();
        }
    }
}
class program10{
    public static void main(String[] args) {
        try{
            police.verifyspeed(37);
            police.verifyspeed(345);
        }catch(overSpeedException e){
        e.printStackTrace();
    }
    }
}