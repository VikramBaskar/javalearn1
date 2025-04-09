
import java.io.Serializable;


 class Employee implements Serializable{
    private int id;
    private String str;
    public int getid(){
        return id;
    }
    void setid(int id){
        this.id=id;
    }
    public String getstr(){
        return str;
    }
    void setstr(String str){
        this.str = str;
    }
}
public class program2 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setid(12);
        e.setstr("sdf");

        System.out.println("Id :"+ e.getid());
        System.out.println("name str :"+e.getstr());
    }
}