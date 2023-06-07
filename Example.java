import java.util.ArrayList;
import java.util.List;

public class Example {
 public static <E> void main(String[] args) {
	List l=new ArrayList();
	
	l.add(10);
	l.add("hii");
	l.add(25.4f);
	l.add(69.4);
	l.add('x');
	
	System.out.println(l);
	System.out.println(l.get(1));
}
}
