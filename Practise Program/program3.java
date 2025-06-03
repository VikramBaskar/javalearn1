class program3{   // dupliacte number indentify
    public static void main(String[] args) {
        int[]arr ={12,11,23,34,34,23,11,22,22,12,12,34,45};
        int[] dup = new  int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(dup[i]==-1){
                continue;
            }
             
             int count =1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]==arr[i]){
                    count++;
                    dup[j]=-1;
                }
            }
            dup[i] = count;
        }

        int num = 0;
        System.out.println("The Duplicate number are :");
        for(int i=0;i<dup.length;i++){
            if(dup[i]>1){
                System.out.println(arr[i]+" -----> "+ dup[i] +" Times");
                num++;
            }
        }
        System.out.println("The counting of number is :" + num);
        
    }
}