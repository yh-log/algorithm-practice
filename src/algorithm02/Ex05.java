package algorithm02;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/120909
 */

public class Ex05 {
	
	/**
	 * 문제 설명
	 * 1. 자연수를 제곱했을 때 나오는 정수를 제곱수라고 한다.
	 * 2. n이 제곱수라면 1 , 아니라면 2를 return
	 */

	
	// 풀이 1
	// 시간 0.01ms ~ 0.05ms
	public int solution(int n) {
		
		for(int i = 1; i * i <= n; i++) {
			if(i * i == n) {
				return 1;
			}
		}
		
		return 2;
	}
	
	// 풀이 2. Math.sqrt 사용
	//	▶ sqrt : 제곱근을 반환하는 함수
	// 시간 0.02ms ~ 0.04ms
	// sq가 정수일 경우 (xx.0) 1 실수일 경우 2를 return
	public int solution1(int n) {
		double sq = Math.sqrt(n);
		
		return (sq == (int) sq) ? 1 : 2;
	}
	
	// 풀이 3. sqrt 와 나머지 연산자 활용
	// n을 제곱근으로 나눈 나머지가 0일 경우 제곱수이기 때문
	public int solution2(int n) {
		
		if(n % Math.sqrt(n) == 0) {
			return 1;
		}
		return 2;
	}
	
	
	public static void main(String[] args) {
		Ex05 ex05 = new Ex05();
		System.out.println(ex05.solution1(144));
	}
}
