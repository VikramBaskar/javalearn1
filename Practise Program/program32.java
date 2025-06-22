// class program32{
//     public  static int firstdigit(int n){
//         while(n>=10)
//             n/=10;
//             return n;
        
//     }

//     public static int lastdigit(int n){
//         return (n%10);
//     }

//     public static void main(String[] args) {
        
//         int n =987237274;
//         System.out.println(firstdigit(n)+" first digit!....");
//         System.out.println(lastdigit(n)+" Last digit!/...");
//     }
// }

class program32{
    public static void main(String[] args) {
        int n=87366;
        String s= Integer.toString(n);
        int first_digit = s.charAt(0)-'0';
        int last_digit = s.charAt(s.length()-1)-'0';
        System.out.println(first_digit+" first digit of "+n);
        System.out.println(last_digit+" lastdigit of "+n);
    }
}