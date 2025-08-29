





class program61{
        // public static void main(String[] args) {
        //     int[] xc ={1,2,3,45,56,7};
        //     int dc =Arrays.stream(xc)
        //                 .distinct()
        //                 .boxed()
        //                 .sorted((a,b)->b-a)
        //                 .skip(1)
        //                 .findFirst()
        //                 .orElseThrow(() ->new RuntimeException("No second largest element"));
        //             System.out.println("Second max num is : "+dc);
                    
        // }

        // public static void main(String[] args) {
        //     int[] df ={1,2,3,4,5,6,6,7,8,9,9,7};
        //     int secondmax =Arrays.stream(df)
        //                 .distinct()
        //                 .boxed()
        //                 .sorted((a,b) -> b-a)
        //                 .skip(1)
        //                 .findFirst()
        //                 .orElseThrow(()-> new RuntimeException("No second largest element  found "));
        //                 System.out.println("Second largest number : "+secondmax);
        // }

        // public static void main(String[] args) {
        //     int[] we ={1,2,3,4,54,5,667,7,5,67,7,8,8,9,9,999};

        //     int secondlarge =Arrays.stream(we)
        //                         // .distinct()
        //                         .boxed()
        //                         .sorted((a,b) ->b-a)
        //                         .skip(1)
        //                         .findFirst()
        //                         .orElseThrow(()->new RuntimeException("No element is found in given array "));
        //                         System.out.println("The second largest number is : "+secondlarge);
                                
        // }

        public static void main(String[] args) {
            int[] arr = {1,2,3,4,5,6,6,7};
            int max =arr[0];
                int secondmax =Integer.MIN_VALUE;
                for(int i=1;i<arr.length;i++){
                        if(arr[i]>max){
                                secondmax=max;
                                max=arr[i];
                        }
                        else if(arr[i] > secondmax && arr[i] !=max){
                                secondmax=arr[i];
                        }
                }
                System.out.println("Second largest number is : "+secondmax      );
        }
}