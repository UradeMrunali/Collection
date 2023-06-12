
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHshMapEx {
 
	 public static void main(String[] args) {
			LinkedHashMap<Integer, String> h= new LinkedHashMap<Integer, String>();
			
			h.put(0, "Mrunali");
			h.put(5, "Season");
			h.put(2, "Mangoes");
			h.put(3, "in");
			h.put(1, "Loves");
			h.put(4, "Summer");
			h.put(3, "hiii");
			h.put(null, null);
			h.put(1, null);
			
			System.out.println(h);
			System.out.println("Iterating Hashmap...");  
			   for(Map.Entry m : h.entrySet()){    
			    System.out.println(m.getKey()+" "+m.getValue()); 
}
 }
}
