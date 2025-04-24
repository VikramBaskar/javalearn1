class AA{
    static int a = 12; 
}


public class program1 {

    public static void main(String[] args) {


        int[] arr = {12, 13, 11, 10, 9};
        int[] ar = {};
        for (int i = 0; i < arr.length; i++) {
            {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] < arr[j]) {
                        int t = arr[i];
                        arr[i] = arr[j];
                        arr[j] = t;

                    }
                }

            }

        }
        System.err.println(AA.a);
        AA W = new AA();
        System.err.println(W.a);
        System.out.println("as val: ");
      
        for (int k = 0; k < arr.length; k++) {
            System.err.println(arr[k]);
        }

    }

}
