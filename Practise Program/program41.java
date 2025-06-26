//single ton class
class program41{
    private static program41 con =null;
    public static program41 getprogram41(){
        if(con==null){
            con=new program41();
        }
        return con;
    }
    private program41(){
        
    }
}