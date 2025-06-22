// count digit

// class program33{
//     public static int countdigit(int n){
//          int count =0;
//          if(n==0){
//             return 0;
//          }
//          while(n!=0){
//             n=n/10;
//            ++count;
//          } 
//          return count;
//     }
//     public static void main(String[] args) {
//         int n=24343;
//         System.out.println("The total digit is :" + countdigit(n));
//     }
// }

class program33{
    static int countdigit(int n){
        
        String num = Long.toString(n);
        return num.length();
    }
    public static void main(String[] args) {
        int n=87234;
        System.out.println("count of digit is :"+countdigit(n));
    }   
}