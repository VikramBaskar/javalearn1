//dowmcasting
class apple{
    void test(){
        System.out.println("Quality analyst in apple");
    }
}
class orange extends apple{
    void taste(){
        System.out.println("Orange has good taste");
    }
}
class program6{
    public static void main(String[] args) {
        apple ap = new orange();
        ap.test();
        orange or = (orange)ap;
        or.taste();


    }
}