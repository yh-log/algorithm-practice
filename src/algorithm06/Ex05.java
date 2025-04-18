package algorithm06;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/181936
 */

public class Ex05 {
	
	/**
	 * 문제 설명
	 * 1. number이 n과 m의 배수이면 1 return
	 * 2. 아닐경우 0을 return
	 */
	
	// 풀이
	// 시간 0.01ms ~ 0.02ms
	public int solution(int number, int n, int m) {
		
		return (number % n == 0 && number % m == 0) ? 1: 0;
	}
	
	
	public static void main(String[] args) {
		Ex05 ex05 = new Ex05();
		System.out.println(ex05.solution(60, 2, 3));
		System.out.println(ex05.solution(55, 10, 5));
	}

}
