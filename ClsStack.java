import java.util.Stack;
import java.util.Vector;

public class ClsStack {
  
	public static void main(String[] args) {
		

		 Stack a=new Stack();
			
			a.push(50);
			a.push("by");
			a.push('h');
			a.push(2.5f);
			a.push(50.27);
			a.push('h');
			a.push(67);
			a.push("hiiii");
			a.push('h');
			
			System.out.println(a);
			System.out.println(a.peek());
			System.out.println(a.pop());
			System.out.println(a);
	}
}
