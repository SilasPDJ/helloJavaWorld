package helloWorld;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	protected static boolean isPrimeNumber(int num) {
		// return true => is prime;
		// return false=> is NOT prime
		int num2loop = num < 0 ? num * -1 : num;

		if (num != 0) {
			for (int i = 1; i <= num2loop; i++) {
				if (i != 1 && i != num2loop && num % i == 0) {
					return false;
				}
			}
			return true;
		} else {
			return false;
			// 0...
		}
	}
}
