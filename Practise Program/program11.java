class dum{

}

class rum{
    public int hashCode(){
        return 132;
    }
}

class program11{
    public static void main(String[] args) {
        
        dum d = new dum();
        rum r = new rum();
        System.out.println(d.hashCode());
        System.out.println(r.hashCode());
    }
}