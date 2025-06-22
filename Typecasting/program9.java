class program9{
    public static void main(String[] args) {
         String str = "Badass";
    char[] c= str.toCharArray();
    str="";
    for(int i=c.length -1;i>=0;i--){
        str =str + c[i];
      
    }
      System.out.println(str);
        
    }
}