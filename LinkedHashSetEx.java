
import java.util.LinkedHashSet;

public class LinkedHashSetEx {
	public static void main(String[] args) {
		LinkedHashSet h=new LinkedHashSet();
		
		h.add(5);
		h.add("hi");
		h.add(null);
		h.add(5);
		h.add('b');
		
		System.out.println(h);
		
	}
}
