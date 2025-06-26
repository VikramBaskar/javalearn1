//hashcode
class flat{

}
class home extends flat{
    public int hashCode(){
        return 123;
    }
}
class program17{
    public static void main(String[] args) {
        flat f= new flat();
        System.out.println(f.hashCode());
        home h = new home();
        System.out.println(h.hashCode());
    }
}