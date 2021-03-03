package array;

public class Test {

	void m1(String s) {
		System.out.println(s);
	}
	void m1(Object s) {
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		Test t=new Test();
		t.m1(null);
	}
}
