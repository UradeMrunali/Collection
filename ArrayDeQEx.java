import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeQEx {
 public static void main(String[] args) {
	
	 Deque d=new ArrayDeque();
	 
	 d.add(5);
	 d.add(65);
	 d.add(21);
	 d.add(22);
	 d.add(75);
	 d.offer(66);
	 d.offer(21);
	 
	 System.out.println(d);
	 System.out.println(d.remove());
	 System.out.println(d.peek());
	 System.out.println(d.poll());
	 System.out.println(d.element());
	 System.out.println(d);
	 
}
}
