final class program5 {
    public static void main(String[] args) {
        
        // contract1 cc = (a,b) ->{System.out.println("Follow Rules !-------"+(a+b));};
        // cc.rule1(10,30);
        // cc.rule3();
        // contract1.rule2();
        contract1 cc = (a,b)->{return a+b;};
        System.out.println("HI this is adding number !...."+cc.rule1(100, 200));
    }
}