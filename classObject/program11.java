class circle{
private int a=10;
private double s = 2.3;

public boolean equals(Object d){
    circle cr = (circle)d;
    if(a==cr.a && s==cr.s){
        return true;
    }
    else{
        return false;
    }
}

}
class program11{
    public static void main(String[] args) {
        circle cr = new circle();
        System.out.println(cr.equals(cr));
    }
}