package student;
import java.util.Scanner;

	public class Inventory {
	    String pname;
	    int price;
	    int quantity;
	    Scanner sc;
	    static String banner = "Welcome to ISM";
	    
	    void add() 
	    {
	        sc = new Scanner(System.in);
	        System.out.println("Enter product name");
	        pname = sc.next();
	        System.out.println("Enter product price");
	        price = sc.nextInt();
	        System.out.println("Enter product quantity");
	        quantity = sc.nextInt();
	    }

	    void show()
	    {
	        System.out.println("Product name = "+pname+ "\nPrice = "+price+ "\nQunatity = "+quantity);
	    }

	    void discount()
	    {
	        if (price>3000) 
	            System.out.println("You are eligible for 10% discount");
	        else 
	            System.out.println("You are eligible for 9% discount");
	    }
	    
	    void displayBanner()
	    {
	    	System.out.println (banner);
	    }
	    
	   
	public static void main(String[] args) {
		
		Inventory i = new Inventory();
		i.displayBanner();
		i.add();
		i.show();
		i.discount();

	}

}
