// class program12{ //reverse String
// public static void main(String[] args) {
// String str = "balamurugan";
// char[]ch = str.toCharArray();
// str = " ";
// for(int i=ch.length-1;i>=0;i--){
//   str = str+ch[i];
// }
// System.out.println(str);
// }
// }

class program12{
  public static void main(String[] args) {
      String st = "Composition";
      char[]ch =st.toCharArray();
      st =" ";
      for(int i=ch.length-1;i>=0;i--){
        st=st+ch[i];
      }
      System.out.println(st);
  }
}