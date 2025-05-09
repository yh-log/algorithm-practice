package algorithm08;


/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/12934
 */

public class Ex06 {
	
	
	/*
	 * 문제 설명
	 * 1. 정수 n이 x의 제곱이라면 x+1의 제곱을 리턴
	 * 2. n이 x의 제곱이 아니면 -1을 return
	 */
	
	/**
	 * 방법 고민
	 * 1. 제곱은 자기 자신을 곱했을 때 나오는 수이다.
	 * 2. Math.sqrt() 를 사용해 정수일 경우 제곱이 가능하고
	 * 3. 소수일 경우 -1을 리턴하도록 코드 구성
	 */
	
	
	// 풀이
	// 시간 0.04ms ~ 0.08ms
	public long solution(long n) {
		
		if(Math.sqrt(n) % 1 > 0) {
			return -1;
		}else {
			return (long) ((Math.sqrt(n) + 1) * (Math.sqrt(n) + 1));
		}
		
	}

	
	
	
	public static void main(String[] args) {
		Ex06 ex06 = new Ex06();
		System.out.println(ex06.solution(3));
		System.out.println(ex06.solution(121));
	}

}
