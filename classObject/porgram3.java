
class company{
    private int empid = 101;

    public boolean equals(Object obj){
        company emp  =(company)obj;
      return   this.empid ==emp.empid;
       
    }
}
public class porgram3{
    public static void main(String[] args) {
     
        company c = new company();
        company c1=  new company();
        System.out.println(c.equals(c));
    }
}