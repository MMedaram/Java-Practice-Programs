package numbers;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SeparateZeerosandOnes {

	public static void main(String[] args) {
		Integer[] input={0,1,1,0,1,1,0,0,1,0,1,0};
		System.out.println(Arrays.asList(input).stream().sorted().collect(Collectors.toList()));
		
	}
	
	
}
