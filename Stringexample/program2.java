class program2{
    public static void main(String[] args) {
        String s1 = "program";
        System.out.println(s1.toString());
        String s2 = "A";
        System.out.println(s2.hashCode());
        String s3 = new String("kjhb");
        System.out.println(s3.equals(s1));
    }
}