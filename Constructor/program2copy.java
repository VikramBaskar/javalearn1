class Rect{
    int rect;
    Rect( int r){
        rect =r;
    }
    Rect(Rect o){
        rect = o.rect;
    }
    void dis(){
        System.out.println("Display value :"+rect);
    }
}
public class program2copy{
    public static void main(String[] args) {
        Rect r = new Rect(23);
        r.dis();
    }
}