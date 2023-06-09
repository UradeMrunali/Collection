import java.util.HashSet;

public class HashSetEx {
	public static void main(String[] args) {
		HashSet h=new HashSet();
		
		h.add(5);
		h.add("hi");
		h.add(null);
		h.add(5);
		h.add('b');
		
		System.out.println(h);
		
	}
}
