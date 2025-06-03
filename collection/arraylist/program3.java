
import java.util.ArrayList;



class program3{

    public static void main(String[] args)
    {
        double Average;
        int total = 0;

     ArrayList<Integer> arr = new ArrayList<Integer>();
     arr.add(12);
     arr.add(13);
     arr.add(14);
     for(int i=0;i<arr.size();++i){
        total +=arr.get(i);
        Average =total/arr.size();
        System.out.println("The total average is :"+Average);
     }

}
}