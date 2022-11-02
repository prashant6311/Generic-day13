package generic;

public class Generic<T extends Comparable<T>> {

	private T num1, num2, num3;

	public Generic(T num1, T num2, T num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}

	public Generic() {
	}

	public T maxValue() {

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
		Generic<Integer> intObj = new Generic<>(num1, num2, num3);
		Integer max = intObj.maxValue();
		System.out.println("Max value out of 50, 100 and 20 is " + max);

		Float numF1 = 50.6f, numF2 = 100.9f, numF3 = 20.9f;
		Generic<Float> floatObj = new Generic<>(numF1, numF2, numF3);
		Float maxFloat = floatObj.maxValue();
		System.out.println("Max number between " + numF1 + ", " + numF2 + " and " + numF3 + " is " + maxFloat);

		String str1 = "hello", str2 = "yahoo", str3 = "goat";
		Generic<String> strObj = new Generic<>(str1, str2, str3);
		String maxString = strObj.maxValue();
		System.out.println("Max String among--> " + str1 + ", " + str2 + " and " + str3 + " is " + maxString);

	}
}
