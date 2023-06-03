import java.util.ArrayList;

public class ArrList {
	
 public static void main(String[] args) {
	ArrayList a=new ArrayList();
	
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
	
//	int secondIndex = (a.indexOf('h')+1);
//	System.out.println("second index of h is:" + secondIndex);
	
	
	
	System.out.println("last index of h is:" +a.lastIndexOf('h'));
	
	System.out.println("element at 5 index is: "+a.get(5));

	System.out.println("Final array: "+a);
}
}
