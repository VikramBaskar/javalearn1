class  program46{
    public static void main(String[] args) {
        int[] ar1 ={1,2,3,4,56,76,89};
        int max= ar1[0];
        for(int i=0;i<ar1.length;i++){
            if(ar1[i]>max){
                max=ar1[i];
            }
        }
        System.out.println("Maximum: "+max);
    }
}