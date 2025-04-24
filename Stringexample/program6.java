
//Boxing / Unboxing & parser method in wapper class
class program6{
public static void main(String[] args) {
    int a =10;
    Integer i1 = new Integer(a);
    System.out.println(i1);
    double d = 1.2;
    Double ref =d;
    System.out.println(ref);
    char q = 'w';
    Character ch = q;
    System.out.println(ch);
    // unboxing
    Integer i = 12;
    int in = i;
    System.out.println(in);

    // parser method
    String s1 = "123";
    int a1 = Integer.parseInt(s1);
        System.out.println(a1);
   
  String st = "12.45";
  double d1 = Double.parseDouble(st);
  System.out.println(d1);

//   String ste = "34.56";
//   int val = Integer.parseInt(ste);
//   System.out.println(val);
  String se ="1.2344555f";
  long f =Long.parseLong(se);
  System.out.println(f);
}
}