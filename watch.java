class watch{
    String name;
    String brand;
    Double price;
    void wear(){
        System.out.println("Super Watch");
        
    }
    void time(){
        System.out.println("Known Time");
    }
    public static void main(String[] args) {
        watch w = new watch();
        w.name = "XZA12";
        w.brand ="Timex";
        w.price = 12000.00;
        w.wear();
        w.time();
        System.out.println(w.name);
        System.out.println(w.brand);
        System.out.println(w.price);
    }
}