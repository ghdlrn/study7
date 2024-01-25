package java_20240125;

public class Method1 {

	public static void main(String[] args) {

		System.out.println("Hello~~~~~~");
		
		int num = max(100, 20);
		
		System.out.println("최대값 : " + num);
	}

	static int max(int n1, int n2) {
		System.out.println("난 최대!!");
		return n1>n2? n1 : n2;
	}
	
	static int min(int n1, int n2) {
		System.out.println("난 최소!!");
		return n1<n2? n1 : n2;
	
	}
}	
