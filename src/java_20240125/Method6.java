package java_20240125;

public class Method6 {

/*
 * 메소드 : findMax
 * 매개변수 : int[]
 * 반환 : int
 * 정수 배열(5개 짜리)를 입력받아 배열 내의 최대값을 찾아 반환
 * 반환 있고 매개변수 있음
 */
	public static void main(String[] args) {
		
		int[] arrNum = {20, 40, 10, 50, 90};
		int num = findMax(arrNum);
		System.out.println("max : " + num);
	}

	static int findMax(int[] arr) {
		
		int max = 0;
		
		for(int i=0; i<arr.length; i++)
			if(max<arr[i])
				max = arr[i];
						
		return max;
	}
}	
