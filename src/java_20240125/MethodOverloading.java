package java_20240125;

public class MethodOverloading {

/*
 * 메소드 : calculateEvenSum
 * 매개변수 : int
 * 반환 : int
 * 주어진 정수 N까지의 모든 짝수의 합을 계산하는 함수를 작성하세요
 */
	public static void main(String[] args) {
		
		int arrNum = calculateEvenSum(7);
		System.out.println("모든 짝수의 합은 : " + arrNum);
		
	}

	static int calculateEvenSum(int arr) {
			int num = 0;
			
		for(int i=0; i<=arr; i++) {
			if(i % 2 == 0) {
				num += i;
			}
		}			
		return num;
	}
}	
