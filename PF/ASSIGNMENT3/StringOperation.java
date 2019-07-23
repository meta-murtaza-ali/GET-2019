/**
 * Design a class that perform following operations on Strings, without using
 * Java APIs. Assume strings to be not null and case sensitive.
 * 
 * @author Murtaza
 *
 */
public class StringOperation {

	/**
	 * @param s1
	 * @param s2
	 * @return return 1 if string are same else return 0
	 * @throws Exception
	 */
	public int compareTo(String s1, String s2) throws Exception {
		if (s1.length() != s2.length()) {
			return 0;
		}
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				return 0;
			}
		}
		return 1;
	}

	/**
	 * @param s
	 * @return reverse of the string
	 */
	public String Reverse(String s) {
		String reverse = " ";
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse += s.charAt(i);
		}
		return reverse;
	}

	/**
	 * @param s
	 * @return return toggle of a string
	 */
	public String ToggleString(String s) {
		char c[] = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (c[i] >= 97 && c[i] <= 122) {
				c[i] = (char) (c[i] - 32);
			} else if (c[i] >= 65 && c[i] <= 90) {
				c[i] = (char) (c[i] + 32);
			}
		}
		String string = new String(c);
		return string;
	}

	/**
	 * @param s
	 * @return largest word of a string
	 */
	public String largest_word(String s) {
		String[] string = s.split(" ");

		int max = 0, count = 0;
		for (int i = 0; i < string.length; i++) {
			// System.out.println(max);
			if (string[i].length() > count) {
				count = string[i].length();
				max = i;
			}
		}

		return string[max];
	}

	public static void main(String[] args) throws Exception {
		StringOperation n = new StringOperation();
		System.out.println(n.compareTo("Jyoti jii", "jyoti jii"));
		System.out.println(n.Reverse("Murtaza Ali"));
		System.out.println(n.largest_word("Murtaza Ali"));
		System.out.println(n.ToggleString("Murtaza Ali"));
	}

}
