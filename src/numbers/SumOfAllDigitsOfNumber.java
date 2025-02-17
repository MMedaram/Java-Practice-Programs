package numbers;

public class SumOfAllDigitsOfNumber {

	static void sumOfAllDigits(int inputNumber) {
		int copyOfInputNumber = inputNumber;
		int sum = 0;
		while (copyOfInputNumber != 0) {
			int lastDigit = copyOfInputNumber % 10;
			sum = sum + lastDigit;
			copyOfInputNumber = copyOfInputNumber / 10;
		}
		System.out.println("Sum Of All Digits In " + inputNumber + " = " + sum);
	}

	public static void main(String[] args) {
		sumOfAllDigits(123);
	}
}
