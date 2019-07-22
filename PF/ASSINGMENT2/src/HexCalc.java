
public class HexCalc {

	public String add(String Hex1,String Hex2)throws Exception {
		int hex1 = Integer.parseInt(Hex1,16);
		int hex2 = Integer.parseInt(Hex2, 16);
		if(hex1 < 0 && hex2 < 0) {
			throw(new Exception("Negative number"));
		}
		return Integer.toHexString(hex1 + hex2);
	}
	
	public String Subtract(String Hex1, String Hex2)throws Exception {
		int hex1 = Integer.parseInt(Hex1,16);
		int hex2 = Integer.parseInt(Hex2, 16);
		if(hex1 < 0 && hex2 < 0) {
			throw(new Exception("Negative number"));
		}
		return Integer.toHexString(hex1 - hex2);
	}
	
	public String Divide(String Hex1, String Hex2)throws Exception {
		int hex1 = Integer.parseInt(Hex1,16);
		int hex2 = Integer.parseInt(Hex2, 16);
		if(hex1 < 0 && hex2 < 0) {
			throw(new Exception("Negative number"));
		}
		return Integer.toHexString(hex1/hex2);
	}
	
	public String Multiply(String Hex1, String Hex2)throws Exception {
		int hex1 = Integer.parseInt(Hex1,16);
		int hex2 = Integer.parseInt(Hex2, 16);
		if(hex1 < 0 && hex2 < 0) {
			throw(new Exception("Negative number"));
		}
		return Integer.toHexString(hex1 * hex2);
	}
	
	public boolean isEqual(String Hex1,String Hex2) {
		if(Hex1.compareTo(Hex2)==0) {
			return true;
		}
		return false;
	}
	
	public boolean isGreater(String Hex1,String Hex2) {
		if(Hex1.compareTo(Hex2) > 0) {
			return true;
		}
		return false;
	}
	
	public boolean isSmaller(String Hex1,String Hex2) {
		if(Hex1.compareTo(Hex2) < 0) {
			return true;
		}
		return false;
	}
	
	public int toDecimal(String Hex , int n) {
		return Integer.parseInt(Hex, n);
	}
	
	public String Decimalto(int Dec_num) {
		return Integer.toHexString(Dec_num);
	}
	
	public static void main(String []args) {
		HexCalc h = new HexCalc();
		String hex1 = "1AB";
		String hex2 = "1AB";
		try {
			String res = h.add(hex1, hex2);
			System.out.println("Addition of two hexadecimal "+res);
			res = h.Subtract(hex1, hex2);
			System.out.println("Subtract of two hexadecimal "+res);
			res = h.Divide(hex1, hex2);
			System.out.println("divide of two hexadecimal "+res);
			res = h.Multiply(hex1, hex2);
			System.out.println("Multiply of two hexadecimal "+res);
			boolean res1 = h.isEqual(hex1, hex2);
			System.out.println("Is  hexadecimal String are Equal "+res1);
			res1 = h.isGreater(hex1, hex2);
			System.out.println("Is  hexadecimal String are Greater "+res1);
			res1 = h.isSmaller(hex1, hex2);
			System.out.println("Is  hexadecimal String are Smaller "+res1);
			int res2 = h.toDecimal(hex1, 16);
			System.out.println("Convert Hexadecimal to Decimal "+res2);
			res = h.Decimalto(15);
			System.out.println("Convert Decimal to Hexadecimal "+res);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
