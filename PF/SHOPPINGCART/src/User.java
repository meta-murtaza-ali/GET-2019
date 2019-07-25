import java.util.Map;
import java.util.Scanner;

class User {

	public static void main(String[] args) {
		int t = 1;
		double t1, total = 0;
		String str;
		Store s = new Store();
		Cart c = new Cart();
		s.create();
		System.out.println("Items with their prices ");
		s.display();
		System.out.println("Items with their ids ");
		s.displayid();

		while (t != 0) {
			System.out.println("Select any one:- ");
			System.out.println("1.Add Item");
			System.out.println("2.Delete Item");
			System.out.println("3.Update Cart");
			System.out.println("4.Bill Amount");
			System.out.println("5.Display Cart");
			System.out.println("6.Exit");

			Scanner sc = new Scanner(System.in);
			t = sc.nextInt();

			switch (t) {
			case 1:
				if(!c.AddItem())
					break;
				break;
			case 2:
				c.DeleteItem();
				break;
			case 3:
				c.UpdateCart();
				break;
			case 4:
				c.Bill();
				break;
			case 5:
				total=0;
				for (Map.Entry<Integer, Double> entry : c.mapcart.entrySet()) {
					int userkey = entry.getKey();
					double userquant = entry.getValue();
					str = s.itemId.get(userkey);
					t1 = (s.itemPrice.get(str)) * userquant;

					total += t1;
					System.out.println(userkey + "  " + str + "  " + userquant
							+ "  " + t1);
				}
				System.out.println("Your total amount is " + total);
				if (total == 0) {
					System.out.println("Your cart is empty");
				}
				break;
			case 6:
				t = 0;
				break;

			default:
				System.out.println("Invalid choice. Please enter again !");
				break;
			}

		}

	}

}