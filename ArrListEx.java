import java.util.ArrayList;
import java.util.Scanner;

	public class ArrListEx {
	    public static void main(String[] args) {
	        ArrayList l = new ArrayList();
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter elements (type 'done' when finished):");
	        String a = scanner.nextLine();
	        while (!a.equals("done")) {
	            l.add(a);
	      a = scanner.nextLine();
	        }

	        System.out.println("Elements in the ArrayList are: " + l);
	    }
	}


