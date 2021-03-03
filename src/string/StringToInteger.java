package string;
/*
 * String should contain numbers only otherwise java.lang.NumberFormatException will occure 
 * 
 */
public class StringToInteger {
	public static void main(String[] args) 
    {
        String s = "2015";
        int i = Integer.parseInt(s);
        System.out.println(i);          
        int j = Integer.valueOf(s);
        System.out.println(j);     
    }

}
