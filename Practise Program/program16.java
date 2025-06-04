class program16 implements Cloneable{
    private int a =12;
    private String st= "round";
    public Object clone() throws CloneNotSupportedException{
        System.out.println("this is clone");
        return super.clone();
    }
    public static void main(String[] args) {
        program16 pr = new program16();
        pr.a=34;
        pr.st="circle";
        program16 replica=(program16)pr;
        System.out.println(replica.equals(pr));
    }
}
