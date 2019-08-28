package QUESTION2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Calculate Unique Character in the String
 * 
 * @author Murtaza Ali
 *
 */
public class UniqueCharacter {
	static Map<String, Integer> string = new HashMap<>();
	static Map<String, Integer> resultString = new HashMap<>();

	/**
	 * Calculate unique character and return their value
	 * 
	 * @param stringsplit
	 * @return char unique value
	 */
	public static int ToCalUniqueChar(String stringsplit) {
		try {
			if (stringsplit == null) {
				throw (new NullPointerException("String cannot be null"));
			}
			for (String key : string.keySet()) {
				if (key.equals(stringsplit)) {
					return string.get(key);
				}
			}
			string.put(stringsplit, 1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 1;
	}

	/**
	 * Take String and return the final result
	 * 
	 * @param string
	 * @return
	 */
	public static int UniqueChar(String string) {
		int result = 0;
		try {
			for (String key : resultString.keySet()) {
				if (key.equals(string)) {
					return resultString.get(key);
				}
			}
			char[] arr = string.toCharArray();
			Set<Character> set = new HashSet<>();
			int count = 0;
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						count++;
					}
				}
				if (count == 1) {
					set.add(arr[i]);
				}
				count = 0;
			}
			int j = 0;
			char[] newarr = new char[set.size()];
			for (char x : set)
				newarr[j++] = x;
			for (int i = 0; i < newarr.length; i++) {
				result = result + ToCalUniqueChar("" + newarr[i]);
			}
			resultString.put(string, result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String");
		try {
			String inputString = input.nextLine();
			if (inputString == null) {
				throw (new NullPointerException("String cannot be null"));
			}
			System.out.println("ans is:" + UniqueChar(inputString));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
