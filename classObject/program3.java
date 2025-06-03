class station{
    private int q =12;
    private double d =2.4;

    public boolean equals(Object o){
       station st =(station)o;
       if(q==st.q && d==st.d){
        return true;
       }
       else{
        return false;
       }
    }
}
class program3{
    public static void main(String[] args) {
        station st = new station();
        System.out.println(st.equals(st));
    }
}