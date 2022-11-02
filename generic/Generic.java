package generic;

public class Generic {

	public static int maxNumber(Integer num1, Integer num2, Integer num3) {
		if (num1.compareTo(num2) > 0) {
			if (num1.compareTo(num3) > 0) {
				return num1;
			} else {
				return num3;
			}
		} else {
			if (num2.compareTo(num3) > 0) {
				return num2;
			} else {
				return num3;
			}
		}
	}

	public static void main(String[] args) {

		System.out.println("Greatest of 3 number ");
		Integer num1 = 50, num2 = 100, num3 = 20;
		Integer max = maxNumber(num1, num2, num3);
		System.out.println("Max number between " + num1 + ", " + num2 + " and " + num3 + " is " + max);

	}
}
