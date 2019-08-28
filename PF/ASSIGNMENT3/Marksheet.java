/**
 * Design a class Marksheet, which reads in grades of n no of students. Assume n
 * as a positive integer and grades will be between 0 and 100 both inclusive.
 * 
 * @author Murtaza
 *
 */
public class Marksheet {
	/**
	 * @param grades
	 * @param n
	 * @return average of the student
	 * @throws Exception
	 */
	public int average(int[] grades, int n) throws Exception {
		if (n <= 0) {
			throw (new Exception("divide by zero"));
		}
		int sum = 0;
		for (int i = 0; i < grades.length; i++) {
			sum += grades[i];
		}
		return (sum / n);
	}

	/**
	 * @param grades
	 * @return max_grade
	 */
	public int max_grade(int[] grades) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] > max) {
				max = grades[i];
			}
		}
		return max;
	}

	/**
	 * @param grades
	 * @return min grade
	 */
	public int min_grade(int[] grades) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] < min) {
				min = grades[i];
			}
		}
		return min;
	}

	/**
	 * @param grades
	 * @param n
	 * @return percentage of the students
	 */
	public float percentStudentPass(int[] grades, int n) {
		float count = 0;
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] >= 40)
				count++;
		}
		float per = ((count / n) * 100);
		return per;
	}

	public static void main(String args[]) throws Exception {
		Marksheet m = new Marksheet();
		int arr[] = new int[] { 10, 20, 40, 50, 30, 60, 35, 80 };
		if (arr.length == 0)
			throw (new Exception("empty array"));
		System.out.println(m.average(arr, arr.length));
		System.out.println(m.max_grade(arr));
		System.out.println(m.min_grade(arr));
		System.out.println(m.percentStudentPass(arr, arr.length));

	}

}
