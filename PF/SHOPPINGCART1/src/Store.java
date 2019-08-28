import java.util.HashMap;
public class Store {
	HashMap<String , Integer> item = new HashMap<>();
	int price;
	public Store() {
		item.put("Pen", 10);
		item.put("Pencil",20);
		item.put("Rubber", 10);
	}
	
	public int Price(String name) {
		price = item.get(name);
		return price;
	}
	
	public void display(){
		System.out.println(item);
	}

}
