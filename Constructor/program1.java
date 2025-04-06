//default Constructor

//created by a compiler
//programmer fails to create a constructor, it take default value

class program1{
int a;
double d;
void program1(){
    System.out.println();
}
public static void main(String[] args) {
    program1 pr = new program1();
    System.out.println(pr.a);
    System.out.println(pr.d);
    pr.program1();
}
}