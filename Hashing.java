import java.util.HashMap;
public class Hashing {
    public static void main(String[] args) {
        HashMap<String , Integer> map= new HashMap<>();
        map.put("India", 140);
        map.put("US", 30);
        map.put("China", 150);
        //System.out.println(map);

        //map.put("China", 180);
        //System.out.println(map);

        if(map.containsKey("India")){
            System.out.println("key is present in the map");
        }else{
            System.out.println("key is not present in the map");
        }

        System.out.println(map.get("Chin"));
        System.out.println(map.get("America"));
    }
}
