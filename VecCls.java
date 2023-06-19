import java.util.LinkedList;
import java.util.Vector;
public class VecCls {
  public static void main(String[] args) {
	
	 Vector a=new Vector(5,3);
		
		a.addElement(50);
		a.addElement("by");
		a.addElement('h');
		a.addElement(2.5f);
		a.addElement(50.27);
		a.addElement('h');
		a.addElement(67);
		a.addElement("hiiii");
		a.addElement('h');
		
		System.out.println(a.size());
		System.out.println(a.capacity());
	
}
}
