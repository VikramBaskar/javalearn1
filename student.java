class student{
    int id;
    String name;
    void study(){
        System.out.println("Get job");
    }
    void sleep(){
        System.out.println("relax");
    }
    public static void main(String[] args) {
        student s1  =new student();
        s1.id =101;
        s1.name = "vikram";
        s1.study();
        s1.sleep();
        System.out.println(s1.id);
        System.out.println(s1.name);
        student s2 = new student();
        s2.id = 102;
        s2.name ="Karthik";
        s2.study();
        s2.sleep();
        System.out.println(s2.id);
        System.out.println(s2.name);
    }
}