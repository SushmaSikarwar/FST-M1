package activities;
import java.util.HashMap;
public class Activity11 {
    public static void main(String[] args){
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
        hash_map.put(1,"Red");
        hash_map.put(2,"Green");
        hash_map.put(3,"Blue");
        hash_map.put(4,"White");
        hash_map.put(5,"Black");

        System.out.println("The Original Hashmap:"+hash_map);

        hash_map.remove(4);

        System.out.println("After removing White:"+ hash_map);

        if(hash_map.containsValue("Green")){
            System.out.println("Green exist in the Hashmap");
        }else {
            System.out.println("Green doesn't exist in the Hashmap");
        }

        System.out.println("Number of pairs in the Hashmap is:"+ hash_map.size());
    }
}