import java.util.LinkedList;
import java.util.List;

public class AnyIndex {
	
	static int Index(List<String> l, String find, int r)
	{
		int c=0,i=0;
		for(String s : l) // for-each loop or enhanced loop
		{
			if(s.equals(find))
			{
				System.out.println(l);
			c++;
			if(c==r)
			{
				System.out.println("data"+" "+find+" "+c);
				return i;
			}
			}
			i++;
		}
		
		return -1;
	}
	 
  public static void main(String[] args) {
	  LinkedList<String> l = new LinkedList<String>();
	  
	  l.add("tu");  //0
	  l.add("tera");//1
	  l.add("me");//2
	  l.add("mera");//3
	  l.add("tu");//4
	  l.add("apna");//5
	  l.add("sbka");//6
	  l.add("tu");//7
	  
	  System.out.println(Index(l,"tu",2));

}
}
