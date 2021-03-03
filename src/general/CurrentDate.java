package general;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *  dd mm yyyy
 */
public class CurrentDate {

	public static void main(String[] args) {
		SimpleDateFormat s=new SimpleDateFormat("dd MMM YYYY");
		System.out.println(s.format(new Date()));
	}
}
