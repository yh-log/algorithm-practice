package algorithm10;

//https://school.programmers.co.kr/learn/courses/30/lessons/181938

public class Ex03 {
	
	/**
	 * 문제 설명 - 두 수의 연산값 비교하기
	 * 1. 어떤 수 a b 를 붙였을 때 수와
	 * 2. 2 * a * b를 비교해
	 * 3. 더 큰 값을 return
	 * 4. 만약 같으면 a+b를 리턴
	 */

	
	
	// 풀이
	// 시간 6.30ms ~ 10.96ms
	public int solution(int a, int b) {
		
		int p = Integer.parseInt(a + "" + b);
		int x = 2 * a * b;
		
		return p > x ? p : x;
	}
	
	
	
	
	
	public static void main(String[] args) {
		Ex03 ex06 = new Ex03();
		System.out.println(ex06.solution(2, 91));
	}
	

}
