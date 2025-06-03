// class program2{
//     public static void main(String[] args) {
//         int[]ar  = {12,22,34,56,56,12,33,22,33,12,12,56,22,34};
//         int[] fr =new int[ar.length];
//         for(int i=0; i<ar.length;i++){
//             if(fr[i]==-1){
//                 continue;
//             }
//             int count=1;
//             for(int j=i+1;j<ar.length;j++){
//                 if(ar[j]==ar[i]){
//                     count++;
//                     fr[j]=-1;
//                 }
//             }
//             fr[i]=count;

//         }

//        int Countdup =0;
//        System.out.println("Duplicate Elements:");
//        for(int i=0;i<fr.length;i++){
//         if(fr[i]>1){

//             System.out.println(ar[i] + "--->"+fr[i] + "times");
//         }

//        } 
//        System.out.println("Total number of dulicate element is :"+Countdup);
//     }
// }

// class program2{
//     public static void main(String[] args) {
        
//         int[] ast = {12,11,22,33,12,22,33,55,33,22,12,44,55,44,77};
//         int[] des = new int[ast.length];
//         for(int i=0;i<ast.length;i++){
//             if(des[i]==-1){
//                 continue;
//             }
//             int count=1;
//            for(int j= i+1;j<ast.length;j++){
//             if(ast[j]==ast[i]){
//               count++;
//               des[j]=-1;
//             }
//            }
//            des[i]=count;
//         }
//         int Countdup  =0;
//            System.out.println("Duplicate Element :");
//         for(int i=0;i<des.length; i++){
       
//             if(des[i]>1){
//                 System.out.println(ast[i]+"---->"+des[i]+"times");
//                 Countdup++;
//             }
//         }
//         System.out.println("Total Number of count is :"+Countdup);
//     }
// }

// class program2{
//     public static void main(String[] args) {
//         int[] ad = {12,11,22,12,13,15,18,15,18,13,18,11};
//         int[] vf =new int[ad.length];
//         for(int i =0;i<ad.length;i++){
//             if(vf[i]==-1){
//                 continue;
//             }
//             int count=1;
//             for(int j= i+1;j<ad.length;j++){
//                 if(ad[i]==ad[j]){
//                  count++;
//                  vf[j]=-1;
//                 }
//             }
//             vf[i]=count;

         
//         }
//            int countdp = 0;
//            System.out.println("Duplicate Elements are :");
//             for(int i=0; i<vf.length; i++){
//                 if(vf[i]>1){
            
//                System.out.println(ad[i]+"-->"+vf[i]+"Counted");
//                 countdp++;
//                 }
              
//             }
//             System.out.println("Tne Counted Dp are :"+countdp);
//     }
// }

// class program2{
//     public static void main(String[] args) {
        
//         int[] asd = {11,23,23,34,34,45,34,23,55,65,56,76,45,55,56,65,77};
//         int[] cat = new int[asd.length];
//         for(int i=0;i<asd.length;i++){
//             if(cat[i]==-1){
//                 continue;
//             }
//             int count=1;
//             for(int j =i+1; j<asd.length;j++){
//                 if(asd[i]==asd[j]){
//                     count++;
//                     cat[j]=-1;
//                 }
//             }
//         cat[i]=count;
//         }
//         int countable =0;
//         System.out.println("Countable dupe element are :");
//         for(int i=0;i<cat.length;i++){
//             if(cat[i]>1){
//                 System.out.println(asd[i]+"----->"+cat[i]+"Times");
//                 countable++;
//             }
//         }
//         System.out.println("The Countable is :"+countable);
//     }
// }

// class program2{
//     public static void main(String[] args) {
        
//         int[] xd = {12,11,13,14,15,12,11,14,15,19,18,19,14};
//         int[] sd =new int[xd.length];
//         for(int i=0;i<xd.length;i++){
//             if(sd[i]==-1){
//                 continue;
//             }
//             int adding =1;
//             for(int j =i+1;j<xd.length;j++){
//                 if(xd[j]==xd[i]){
//                     adding++;
//                     sd[j]=-1;
//                 }
//             }
//             sd[i]=adding;
//         }

//          int howmany=0;
//          System.out.println("How many dupe element are :");
//          for(int i=0;i<sd.length;i++){
//             if(sd[i]>1){
//                 System.out.println(xd[i]+"<------>"+ sd[i] +"Times");
//                 howmany++;
//             }
//          }
//          System.out.println("The howmany elements are :"+howmany);
//     }
// }

class program2{
    public static void main(String[] args) {
        int[] m ={9,23,4,24,4,23,9,1,2,12,1,2,12,1};
        int[] d = new  int[m.length];
        for(int i=0;i<m.length; i++){
            if(d[i]==-1){
                continue;
            }
            int referable = 1;
            for(int j=i+1;j<m.length;j++){
                if(m[j]==m[i]){
                    referable++;
                    d[j]=-1;
                }
            }
            d[i]=referable;
        }
        int dpElement = 0;
        for(int i=0;i<d.length;i++){
            if(d[i]>1){
                System.out.println(m[i]+" ----> "+d[i] + "Times");
                dpElement++;
            }
        }
        System.out.println("The dpElement of array is :"+dpElement);
    }
}