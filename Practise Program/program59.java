import java.util.Arrays;

class program59 {
    public static void main(String[] args) {
        int[] as = {1, 2, 3, 4, 5, 6, 7, 8};

        int[] num = Arrays.stream(as)
                          .filter(i -> i % 2 == 0)  
                          .toArray();   
        int count = num.length;            

        System.out.println("Even numbers: " + Arrays.toString(num));
        System.out.println("Count of odd numbers : "+count);

        int[] num1 =Arrays.stream(as)
                    .filter(n -> n%2 !=0)
                    .toArray();
        int count1 =num1.length;
        System.out.println("Odd numbers: "+Arrays.toString(num1));
        System.out.println("Count of odd numbers : "+ count1);
    }
}
