package array;
/*
 * Two arrays are said to be equal if the arrays have equal number of elements and all corresponding pairs of elements in two arrays are equal
 * If you are checking multidimensional arrays for equality, then use deepEquals() method of Arrays class instead of equals() method. Because, deepEquals() performs deep comparison of both the arrays.
 * 
 */
import java.util.Arrays;

public class EqualityOfTwoArrays {

	public static void main(String[] args) {
		  int[] arrayOne = {2, 5, 1, 7, 4};
	      int[] arrayTwo = {2, 5, 1, 7, 4};
	         
	        boolean equalOrNot = false;
	        if(arrayOne.length == arrayTwo.length)
	        {
	            for (int i = 0; i < arrayOne.length; i++)
	            {
	                if(arrayOne[i] == arrayTwo[i])
	                {
	                    equalOrNot = true;
	                }
	            }
	        }
	        if (equalOrNot)
	        {
	            System.out.println("Two Arrays Are Equal");
	        }
	        else
	        {
	            System.out.println("Two Arrays Are Not equal");
	        }
	        
	        String[] s1 = {"java", "j2ee", "struts", "hibernate"};
	        String[] s2 = {"jsp", "spring", "jdbc", "hibernate"};
	        String[] s3 = {"java", "hibernate","j2ee", "struts" };
	        Arrays.sort(s1);
	        Arrays.sort(s2);
	        Arrays.sort(s3);
	        System.out.println("Does S1 and S2 are Equal: "+Arrays.equals(s1, s2));        
	        System.out.println("Does S1 and S3 are Equal :" +Arrays.equals(s1, s3) );        

	}
			
	
        
}
