class program1{
    public static void main(String[] args) {
       int x= 12;
       int y = 46;
        int z=10;
        if(x>y){
            System.out.println("this is millen");
        }
        else if (y>z) {
            System.out.println("This is zelanzkey");
        }
        boolean compare = !(x<y && y>z) || x+5>y ;

        System.out.println(compare);
    }
}