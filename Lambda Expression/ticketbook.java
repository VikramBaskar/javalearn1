



class ticketbook{
    public static void main(String[] args) {
    // Predicate<Integer> p=no->no>60;
    //  System.out.println(p.test(60));

    //    Predicate< String>p=name->(name.length()>=8);
    //    System.out.println(p.test("akjdnsd"));
    
    ArrayList al = new ArrayList();
    al.add(10);
    System.out.println(al.size());
   Predicate<Collection>p =aa-> aa.size()>0;
   System.out.println(p.test(al));
    }

  
    
//    public boolean compare(int age){
//     if(age>60)
//     return true;
//     else return false;
//    }
}