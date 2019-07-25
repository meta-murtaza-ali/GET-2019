import java.util.HashMap;

class Store
	{
		
		HashMap<String, Integer> itemPrice = new HashMap<>(); 
		HashMap<Integer, String> itemId = new HashMap<>(); 
		
		void create()
		{
		itemPrice.put("Pen", 20);
		itemPrice.put("Pencil", 10);
		itemPrice.put("Book", 50);
		itemPrice.put("Notebok", 30);
		
		itemId.put(101, "Pen");
		itemId.put(102, "Pencil");
		itemId.put(103, "Book");
		itemId.put(104, "Notebook");	   
	    }
		void display()
		{
			System.out.println(itemPrice);
		}
		
		void displayid()
		{
			System.out.println(itemId);
		}
	}