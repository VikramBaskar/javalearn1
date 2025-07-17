

class mobile {
      int price;
    //   String type;

    public mobile(int price) {
        // this.price=price;
        // this.type=type;
        System.out.println("Constructor "+price);
    }
      

    public static  void display(int no){
        System.out.println(no);
    }
    public static void main(String[] args) {
        // contract c=a-> System.out.println(a);
    //    mobile m = new mobile();
       contract c=mobile::display;
        // c.display(23);
        // System.out.println(c.disp(12, 23));
          contract.find();
          c=mobile::new;
          c.display(100000);
        
    } 
 
}