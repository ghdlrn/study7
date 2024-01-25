package java_20240125;

public class Method7 {

	public static void main(String[] args) {
		
		System.out.println(add(10,20));
		System.out.println(add(10.2,20.5));
		System.out.println(add(10,20,30));
		
	}

	static int add(int i, int j) {
		return i+j;
	}
	static int add(int i, int j, int l) {
		return i+j+l;
	}
	static double add(double i, double j) {
		return i+j;
		
	}
}	
