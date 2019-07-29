import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class Cart {
	HashMap<String,Integer> map = new HashMap<>();
	int Cartquantity;
	int total = 0;
	Scanner sc = new Scanner(System.in);
	public boolean AddCart(String name) {
		System.out.println("Enter product quantity");
		int quant = sc.nextInt();
		this.Cartquantity = quant;
		map.put(name, quant);
		return true;
	}
	
	public boolean DeleteCart(String name) {
		System.out.println("Enter product quantity");
		int quant = sc.nextInt();
		int remaining = Cartquantity - quant;
		map.remove(name);
		if(remaining!=0) {
			map.put(name, remaining);
		}
		return true;
	}
	
	public void DisplayCart() {
		total=0;
		Store key = new Store();
		int individualTotal =0;
		System.out.println("Productname" + " " + "Productquantity" + " " + "Total");
		for(Entry<String, Integer> entry : map.entrySet()) {
			String name = entry.getKey();
			int quant = entry.getValue();
			int price = key.Price(name);
			individualTotal = price * quant;
			total += individualTotal;
			System.out.println(name + "  " + quant + "  " + individualTotal);
		}
			System.out.println("Your total amount is: " + total);
		
	}

}
