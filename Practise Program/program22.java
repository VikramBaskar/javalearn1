class program22{
    
    public static void main(String[] args) {
    String st = "Compound";
    char[]ch = st.toCharArray();
    st="";
    for(int i=ch.length-1;i>=0;i--){
        st=st+ch[i];
    }
    System.out.println(st);

}

}