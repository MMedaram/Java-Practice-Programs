package array;

import java.util.ArrayList;
import java.util.Arrays;

public class EvenOddSeparation {

	public static void main(String[] args) {
		
		Integer a[]= {12,34,45,9,8,90,3};
		ArrayList<Integer> al=new ArrayList<>(Arrays.asList(a));
		ArrayList<Integer> result=new ArrayList<>();

		System.out.println("Before:"+al);

		for(Integer i:a) {
			if(i%2==0) {
				result.add(i);
			}
		}
		for(Integer i:al) {
			if(i%2!=0) {
				result.add(i);
			}
		}
		
		System.out.println("After:"+result);
	}
}
