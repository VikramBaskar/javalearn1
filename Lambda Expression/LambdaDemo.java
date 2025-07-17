class LambaDemo{
    public static void main(String[] args) {
        //   interfacedemo d= new program1();
    //   d.test();
    //   d.test1();
    //   interfacedemo.test2();

    //   interfacedemo id =  ()->  System.out.println("game program1 2 3 "); 
    //          id.test();

        // interfacedemo id = (a,b)-> System.out.println(a+b+"hi");
            
        // id.add(12, 23);

        interfacedemo id =(int a,int b)->{
            return a+b;
        };
        int result = id.add(12, 54);
        System.out.println(result);
        id.test4();
        id.test1();
         }
}