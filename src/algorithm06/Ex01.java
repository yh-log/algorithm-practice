package algorithm06;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/181937
 */

public class Ex01 {
	
	/**
	 * 문제 설명
	 * 1. num과 n 이 주어질 때
	 * 2. num이 n의 배수이면 1 아니면 0을 return
	 */
	
	
	// 풀이 1. if 문
	// 시간 0.01ms ~ 0.02ms  
	public int solution(int num, int n) {
		
		if(num % n == 0) {
			return 1;
		}
		return 0;
	}
	
	// 풀이 2. 삼항 연산자
	// 시간 0.01ms ~ 0.02ms  
	public int solution1(int num, int n) {
		
		return num % n == 0? 1 : 0;
	}
	
	
	public static void main(String[] args) {
		Ex01 ex02 = new Ex01();
		
		System.out.println(ex02.solution(98, 1));
		System.out.println(ex02.solution(34, 3));
	}

}
