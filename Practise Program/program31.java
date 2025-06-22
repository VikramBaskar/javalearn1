
//is even or not
class program31{
    public static boolean isEven(int n){
        int num =n%2;
        if(num ==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
       int n=16;
        if(isEven(n)==true)
        System.out.println("true");
        else
        System.out.println("false");
    }
}