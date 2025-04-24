class program8{
public static void main(String[] args) {
    String str = "corejava";
    char[]ch = str.toCharArray();
    str=" ";
    for(int i=ch.length-1; i>=0;i--){
        str = str+ch[i];
    }
    System.out.println(str);
}
}