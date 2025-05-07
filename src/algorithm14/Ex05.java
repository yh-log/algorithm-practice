package algorithm14;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/12928
 */

public class Ex05 {
	
	/**
	 * 문제 설명
	 * 1. 정수 n의 모든 약수를 더합 값을 return
	 */
	
	/**
	 * 방법 고민
	 * 1. 약수를 짝을 이룬다
	 * 2. 약수는 
	 */
	
	
	// 풀이
	// 시간 0.01ms ~ 0.04ms
	public int solution(int n) {
		
		int sum = 0;
		
		for(int i = 1; i <= n/2; i++) {
			if(n % i == 0) {
				sum += i;
			}
		}
		
		
		return sum + n;
	}

	
	
	
	
	public static void main(String[] args) {
		Ex05 ex05 = new Ex05();
		System.out.println(ex05.solution(12));
	}
}
