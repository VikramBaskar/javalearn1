
import java.util.HashMap;

class program2{
    public static void main(String[] args) {
        HashMap <String,Integer>hmap = new HashMap<>();
        hmap.put("Book",345);
        hmap.put("Note", 123);
        hmap.put("Paper", 87);
        hmap.put("Bag", 5900);
        hmap.put("Table", 2000);

        // System.out.println(hmap);
        // System.out.println(hmap.get("Book"));
        // System.out.println(hmap.containsKey("Note"));
        // System.out.println(hmap.containsValue(5900));
        // if(hmap.containsKey("aper")){
        //     System.out.println(hmap.get("Paper"));
        // }else{
        //     System.out.println("key not found");
        // }

        for(String key : hmap.keySet()){
            System.out.println(key +": $ "+hmap.get(key));
            
        System.out.println(hmap.get(key));
        }

    }
}