import java.util.LinkedList;
import java.util.Scanner;

public class LinkListFruits {
    public static void main(String[] args) {
        LinkedList<String> L = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);

   
        System.out.println("Enter 5 fruits:");
        for (int i = 0; i < 5; i++) {
            L.add(sc.nextLine());
        }

        System.out.println("Output:");
        
        for (String fruit : L) {
            char firstL = fruit.charAt(0);
            char secondL = fruit.charAt(1);
            char lastL = fruit.charAt(fruit.length() - 1);
           
            System.out.println( firstL+""+secondL+""+lastL);
        }
    }
}

