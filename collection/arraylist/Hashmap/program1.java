
import java.util.HashMap;

class program1{
    public static void main(String[] args) {
        HashMap<String,Double> map = new HashMap<>();
        map.put("Apple", 3.0);
        map.put("Orange", 2.0);
        map.put("Banana", 1.0);
        map.put("grape", 4.0);

      //  System.out.println(map);
    //   map.remove("Apple");
    //  System.out.println(map);  
    //  System.out.println(map.get("Banana"));
    //  System.out.println(map.get("grape"));
    // System.out.println(map.containsKey("Apple"));

    // if(map.containsKey("Apple")){
    //     System.out.println(map.get("pineapple"));
    // }
    // else{
    //     System.out.println("Key not found");
    // }

        // System.out.println(map.containsValue(2.0));

        // for(String key : map.keySet()){
        //     System.out.println(key+" : $ "+map.get(key));
        // }

       for(String key : map.keySet()){
        System.out.println(key +" : $ "+map.get(key));
       }


    }


}