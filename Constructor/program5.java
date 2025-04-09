//copy constructor

class square{
    int side;
    square(int s){
        side = s;
        
    }
    square(square aq){
        System.out.println("print square!....");
        side =aq.side;
         
    }
    public static void main(String[] args) {
        square s =  new  square(1);
        System.out.println(s.side);

        square s1 =  new  square(10);
        System.out.println(s1.side);
    }
}