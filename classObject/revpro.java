class revpro{
    public static void main(String[] args) {
        String str = "Dedmonstation  final";
        char[] ch = str.toCharArray();
        str= " ";
        for(int i=ch.length-1;i>=0;i--){
            str = str +ch[i];
        }
        System.out.println(str);
    }
}