
class Demo<y> {
	void mydemo(y a)
	{
		System.out.println(a);
	}
}


public class GenericCls {
 public static void main(String[] args) {
	Demo d=new Demo();
	d.mydemo(10);
	d.mydemo("hi");
	d.mydemo(10.45);
	
}
}
