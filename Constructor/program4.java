//Copy constructor

class program4{
int side;

    public program4(int s) {
        side = s;
        System.out.println(s);

    }
    program4(program4 obj){
        side = obj.side;
      System.out.println(side);
    }
    public static void main(String[] args) {
         System.out.println("program starts...///");
        program4 pr = new program4(325);
            // System.out.println(pr);
        program4 pr1 = new program4(pr);
    
    }

}