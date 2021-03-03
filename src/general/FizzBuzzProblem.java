package general;

/*Write a program in java which prints the numbers from 1 to 100. But, multiples of 3 should be replaced with “Fizz”, 
  multiples of 5 should be replaced with “Buzz” and multiples of both 3 and 5 should be replaced with “FizzBuzz”?
   */
public class FizzBuzzProblem {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			if((i % (3*5)) == 0) {
				System.out.println("FizzBuzz");
			}
			else if((i % 3) == 0) {
				System.out.println("Fizz");
			}
			else if((i % 5) == 0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}

		}
	}

}
