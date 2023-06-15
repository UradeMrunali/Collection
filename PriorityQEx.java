import java.util.PriorityQueue;

public class PriorityQEx {
 public static void main(String[] args) {
	PriorityQueue<String> p=new PriorityQueue<String>();
	
	 p.add("ears");
	 p.add("banana");
	 p.add("apple");
	 p.add("dog");
	 p.add("dog");
	 p.add("chikoo");
	// p.add(null);
	 
	   
	 System.out.println(p);
	 System.out.println(p.remove());
	 System.out.println(p.poll());
	 System.out.println(p.peek());
	 System.out.println(p.element());
	 System.out.println(p);
}
}
