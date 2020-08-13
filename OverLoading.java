
public class OverLoading {
	
	static void area(int r) {
		System.out.println(3.14*r*r);
	}
	static void area(int l, int b) {
		System.out.println(l*b);
	}
	public static void main(String args[]) {
		area(5);
		area(5, 10);
	}
}
