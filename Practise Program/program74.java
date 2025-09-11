class Industry{
    int am =112;

    public boolean equals(Object obj){
        Industry ind =(Industry)obj;
        return  this.am ==ind.am;
    }
}

public class program74{
    public static void main(String[] args) {
        Industry in  =new Industry();
        Industry in1 =new Industry();
        Industry in2 =null;
        System.out.println(in.equals(in1));
        System.out.println(in.equals(in2));
    }
}