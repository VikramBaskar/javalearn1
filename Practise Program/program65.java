
import java.util.ArrayList;

class program65{
    public static void main(String[] args) {
        int[] asd ={1,2,3,4,5,1,2,3,4,5,3,4,5};
        ArrayList<Integer> al =new ArrayList<>();
        for(int i=0;i<asd.length;i++){
            for(int j=i+1;j<asd.length;j++){
                if(asd[i]==asd[j] && !al.contains(asd[i])){
                    al.add(asd[i]);
                }
            }
        }
        System.out.println("Duplicates : "+al);
    }
}