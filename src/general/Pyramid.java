package general;
/*
  Pyramid 				
     * 
    * * 
   * * * 
  * * * * 
 * * * * * 
 
 */
import java.util.Scanner;

public class Pyramid {
	public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
	    System.out.println("How Many Rows You Want In Your Pyramid?");
        int noOfRows = sc.nextInt();
        int rowCount = 1;
        System.out.println("Here Is Your Pyramid");
        for (int i = noOfRows; i > 0; i--)
        {
            for (int j = 1; j <= i; j++)  // 1 121 12321 1234321     i*2
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= rowCount; j++)
            {
                System.out.print("* ");
            }
            
           /* // 1 121 12321 1234321
             for (int j = rowCount-1; j >= 1; j--)
            {               
                System.out.print(j+" ");            
            }*/      
            System.out.println();
            rowCount++;
        }
        sc.close();
    }
}