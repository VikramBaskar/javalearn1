
import java.util.Arrays;

class arr6{
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5,6,7};
        int sum = 0;
        for(int i=0;i<ar.length;i++){
          sum +=ar[i];
        }
        System.out.println("total number in array is :"+ sum);

        int div=0;
        if(sum!=0){
            div =sum/2;
        }
        int[] divarr = {div};
        System.out.println("Divide number :"+Arrays.toString(divarr));

    }
}