//parameterized Constructor
//We can pass arguments to parameterized constructor...
class program3{
    int capacity;
   
    program3( int a){
        
        capacity =a;
    }
    public static void main(String[] args) {
        program3 pr3=  new program3(23);
        System.out.println("bax capacity :"+pr3.capacity);
    }
}