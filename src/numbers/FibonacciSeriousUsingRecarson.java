package numbers;

public class FibonacciSeriousUsingRecarson {
	static int n1=0,n2=1,n3,count=10;
	public static void main(String[] args) {
		System.out.print(n1+" "+n2);
		fibSerice(count-2);
		
	}
	public static void fibSerice(int count) {
		if(count>0) {
		n3=n1+n2;
		System.out.print(" "+n3);
		n1=n2;
		n2=n3;
		fibSerice(count-1);
		}
	}
}
