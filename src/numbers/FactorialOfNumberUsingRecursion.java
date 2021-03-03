package numbers;

import java.util.Scanner;

public class FactorialOfNumberUsingRecursion {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Entear a number to find Fact:");
		int number=sc.nextInt();
		System.out.println(factNumber(number));
		sc.close();
	}
	static int factNumber(int n) {
		if (n == 0)
			return 1;
		else
			return (n*factNumber(n-1));
		
	}
}
