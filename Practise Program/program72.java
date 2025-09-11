class boxin{
    public void sounds(){
        System.out.println("Sounnds are good !....");
    }
}
class waxin extends boxin{
    public void sounds(){
        System.out.println("Sounds are waxin !......");
    }
    public void music(){
        System.out.println("Music are sooo good!......");
    }
}

class program72{
    public static void main(String[] args) {
        boxin b = new waxin();
        b.sounds();
       waxin a = new waxin();
       a.music();
       a.sounds();
    }
}