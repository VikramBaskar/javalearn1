class laptop{
        private int a= 45;
        private Float f= 3.455f;

    public  boolean equals(Object o){
        laptop lt =(laptop)o;
        if(a==lt.a || f== lt.f){
            return true;
        }
        else{
            return false;
        }

    }
}
class program13{
    public static void main(String[] args) {
        laptop lt  =new laptop();
        System.out.println(lt.equals(lt));
    }
}