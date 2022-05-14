package activities;
import java.util.HashSet;
public class Activity10 {

    public static void main(String[] args){
        HashSet<String> hash = new HashSet<String>();
        hash.add("Sagar");
        hash.add("Manav");
        hash.add("Bobby");
        hash.add("Chandan");
        hash.add("Manav");
        hash.add("Xavier");
        hash.add("Anuj");

        System.out.println("Original Hashset :" + hash);
        System.out.println("Size of Hashset: "+ hash.size());

        System.out.println("Removing Anuj from Hashset:"+hash.remove("Anuj"));
        if(hash.remove("Zandu")){
            System.out.println("Zandu removed from the Hashset");
        }else {
            System.out.println("Zandu is not removed from the Hashset");
        }

        System.out.println("Check if Manav is present: "+ hash.contains("Manav"));
        System.out.println("Updated Hashset: "+ hash);

    }
}
