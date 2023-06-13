import java.util.ArrayList;
import java.util.LinkedList;

public class LinkListEx {
	
 public static void main(String[] args) {
	LinkedList a=new LinkedList();
	
	a.add(50);
	a.add("by");
	a.add('h');
	a.add(2.5f);
	a.add(50.27);
	a.add('h');
	a.add(67);
	a.add("hiiii");
	a.add('h');
	
	
	System.out.println(a);
	 
	a.add(3, 100);
	System.out.println(a);
	
	a.remove(7);
	System.out.println(a);
	
	System.out.println("first index of h is:" +a.indexOf('h'));
	
	System.out.println("last index of h is:" +a.lastIndexOf('h'));
	
	System.out.println("element at 5 index is: "+a.get(5));
	a.set(6, 2000000);

	System.out.println("Final array: "+a);
	
}
}
