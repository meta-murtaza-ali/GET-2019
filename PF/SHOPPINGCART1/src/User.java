

import java.util.Map;
import java.util.Scanner;


class User {

	public static void main(String[] args) {
		int t = 1;
		Store s = new Store();
		Cart c = new Cart();
		System.out.println("Items with their prices ");
		s.display();

		while (t != 0) {
			System.out.println("Select any one:- ");
			System.out.println("1.Add Item");
			System.out.println("2.Delete Item");
			System.out.println("3.Display Cart");
			System.out.println("4.Exit");

			Scanner sc = new Scanner(System.in);
			t = sc.nextInt();

			switch (t) {
			case 1:
				System.out.println("Enter product name:");
				String name = sc.next();
				if (c.AddCart(name))
					break;
				break;
			case 2:
				System.out.println(" product name:");
				name = sc.next();				
				c.DeleteCart(name);
				break;
			case 3:
				c.DisplayCart();
				break;
			case 4:
				t=0;
				break;
			default:
				System.out.println("Invalid choice. Please enter again !");
				break;
			}

		}

	}

}


