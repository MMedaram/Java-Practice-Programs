package numbers;

public class PrimeNumbers {

	public static void main(String[] args) {
		String primeNumbers = "";
		for (int i = 2; i < 10; i++) {
			int counter = 0;
			for (int j = i; j >= 1; j--) {
				if ((i % j) == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				primeNumbers = primeNumbers + i + " ";
			}
		}
		System.out.println(primeNumbers);
	}
}