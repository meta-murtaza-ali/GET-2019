import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

class Cart {
	HashMap<Integer, Double> mapcart = new HashMap<>();

	boolean AddItem() {
		int id;
		double quant;
		System.out.println("Enter the ID");
		Scanner n = new Scanner(System.in);
		id = n.nextInt();
		if (mapcart.containsKey(id)) {
			System.out.println("ïtem already exits");
			System.out.println("do you want to update true or false");
			boolean input = n.nextBoolean();
			if (input) {
				UpdateCart();
				return true;

			}
			else
				return false;
		}
		System.out.println("Enter the quantity");
		quant = n.nextDouble();
		mapcart.put(id, quant);
		return true;
	}

	void DeleteItem() {
		int id;
		System.out.println("Enter the ID");
		Scanner n = new Scanner(System.in);
		id = n.nextInt();
		mapcart.remove(id);

	}

	void UpdateCart() {
		int id;
		double quant;
		System.out.println("Enter the ID");
		Scanner n = new Scanner(System.in);
		id = n.nextInt();
		System.out.println("Update the Quantity");
		quant = n.nextDouble();
		mapcart.put(id, quant);
	}

	void Bill() {
		int total=0;
		double t1;
		Store s = new Store();
		for (Map.Entry<Integer, Double> entry  : mapcart.entrySet()) {
			int userkey = entry.getKey();
			double userquant = entry.getValue();
			String str = s.itemId.get(userkey);
			t1 = (s.itemPrice.get(str)) * userquant;

			total += t1;
			System.out.println(userkey + "  " + str + "  " + userquant
					+ "  " + t1);
		}
		System.out.println("Your total amount is " + total);
	}

}
