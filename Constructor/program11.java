class program11{ // default constructor (all constructor are used in non static blocks only)
    int a;
    int s;

    public program11() { // zero argument constructor
        s=12;

    }
     int capacity;

    public program11(int d) { //parameterized constructor
       capacity=d; 
    }
     
    public static void main(String[] args) {
       program11 pr = new program11();
       System.out.println(pr.a);
       System.out.println(pr.s);
       program11 p = new program11(122);
       System.out.println(p.capacity);
       
    }
}