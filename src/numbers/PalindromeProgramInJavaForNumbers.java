package numbers;

import java.util.Scanner;

public class PalindromeProgramInJavaForNumbers {

	private static boolean isItPalindrome(int inputNumber) 
    {
        int number = inputNumber;
        int reverse = 0;
        int remainder = 0;
         
        while (number != 0)
        {
            remainder = number % 10;
            reverse = (reverse * 10) + remainder;
            number = number / 10;
        }
         
        if(reverse == inputNumber)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
     
    public static void main(String[] args) 
    {
        //Take input number from the user
         
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter a number");
         
        int inputNumber = sc.nextInt();
         
        if (isItPalindrome(inputNumber)) 
        {
            System.out.println(inputNumber+" is a palindrome");
        }
        else
        {
            System.out.println(inputNumber+" is not a palindrome");
        }
         
        sc.close();
    }
}
