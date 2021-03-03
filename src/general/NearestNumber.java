package general;

import java.util.Scanner;

/*
 * Write a Java program to find out the nearest number to 100 of the given two numbers?
 */
public class NearestNumber {
	static int nearestTo100(int input1, int input2) {

		int diff1 = Math.abs(100 - input1);
		int diff2 = Math.abs(100 - input2);
		if (diff1 < diff2) {
			return input1;
		}
		return input2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first no:");
		int in1 = sc.nextInt();
		System.out.println("Enter scond no:");
		int in2 = sc.nextInt();
		System.out.println(nearestTo100(in1, in2));
		sc.close();
	}
}
