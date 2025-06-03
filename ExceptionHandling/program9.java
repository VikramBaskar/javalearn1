class program9{
public static void main(String[] args) {
    try{
        System.out.println("Try starts");
        System.out.println(10/0);
    }
    finally{
        System.out.println("Executing Finally Block");
    }
    
}
}