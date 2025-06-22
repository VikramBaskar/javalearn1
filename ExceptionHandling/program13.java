class custom extends Exception{

}
class program13{
    static void trigger(int num)throws custom{
        if(num%2==0&& num%3==0){
            throw new custom();      
        }
        else{
            System.out.println("All are exceptioon");
        }
        
    }
           public static void main(String[] args) {
        try{
            trigger(23);
            trigger(34);
        }catch(custom e){
            e.printStackTrace();
        }
    
        
    }
 
}