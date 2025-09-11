// find the second largest number

class arr7{
    public static void main(String[] args) {

     int[] ar ={1,2,4,5,2,4,5,7,8,89,23};

      int largest =ar[0];
      for(int i=0;i<ar.length;i++){
        if(ar[i]>largest){
            largest=ar[i];
        }
      }
      System.out.println("The largest number in array :"+largest);
    }
}