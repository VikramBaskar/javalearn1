class student{
    String name;
    int id;

     student(String name, int id) {
       this. name= name;
      this. id = id;
    }
    
}
public  class program8{
    public static void main(String[] args) {
        student st = new student("nichol", 1);
        System.out.println("Name :"+st.name +"Id : "+st.id);
    }
}