package string;

public class NullvsString {

	void m1(Object obj) {
		System.out.println("Object "+obj);
	}

	void m1(String str) {
		System.out.println("String "+str);
	}
	public static void main(String[] args) {
		NullvsString ns=new NullvsString();
		ns.m1(null);
	}
}
