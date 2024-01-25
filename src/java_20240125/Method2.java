package java_20240125;

public class Method2 {
/*
 * 메서드명 : abs
 * 반환타입 : int
 * 매개변수 : int
 * 기능 : 주어진 값의 절대값을 반환한다.
 */
	public static void main(String[] args) {
		int num = abs(-32);
		System.out.println("절대값 : " + num);
	}

	static int abs(int n) {		 
		if (n<0) {
			n = -n;
		}
		return n;
	}
	
}	
