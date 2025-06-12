class program17 implements Cloneable{
    int rad =23;
    String color ="yellow";
    protected Object clone() throws CloneNotSupportedException{
        System.out.println("Bolle are clone ()");
        return super.clone();
    }
    public static void main(String[] args) {
        program17 pf = new program17();
        pf.rad=45;
        pf.color="blue";
        program17 copy =(program17)pf;
        System.out.println(copy.color);
        System.out.println(copy.rad);
        System.out.println(copy.equals(copy));
    }
}