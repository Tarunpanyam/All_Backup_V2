package initial;
import java.util.*;
public class Intial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> friends=new HashMap<>();
        friends.put("friend1", "Mr. ABC");
        friends.put("friend2", "Mr. KBC");
        friends.put("friend3", "Mr. TBC");
        System.out.println("Total Elements : "+friends.size());  // total available elements in map interface
        System.out.println("My Friend 1 is "+friends.get("friend1")); // fetching object from map interface
        friends.remove("friend2"); // Removing object from map
        System.out.println("Total Elements after removing KBC : "+friends.size());
        
        System.out.println("List Objects from Map Interface : "+friends); 
        // printing map interface by overriding toString method
        friends.replace("friend3", "Mr. Xyz"); // replacing value for existing key
        System.out.println("List Objects from Map Interface after replacement : "+friends);
        
        Collection<String> allFriendsKeys=friends.keySet(); // retrieving all the keys from map
        for(String key:allFriendsKeys) {
            System.out.println(key);
        }
	}

}
