package java_20240125;

public class Method3 {
/*
 * 메서드명 : change
 * 반환타입 : int[]
 * 매개변수 : int
 * 기능 : 정수값을 전달하면, 그 정수 수 만큼 배열을 생성해서 전달.
 * 		배열 안에는 1~10까지 난수 입력
 */
	public static void main(String[] args) {
		
		int[] num2 = change(5);
		
		for(int i=0; i<num2.length; i++)
		System.out.print(num2[i]+" ");
	}

	static int[] change(int n) {		 
		int[] num = new int[n];
			for (int i = 0; i<num.length; i++)
				num[i] = (int)(Math.random()*10)+1;
		
		return num;
	}
	
}	
