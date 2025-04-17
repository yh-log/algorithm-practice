package algorithm06;


/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/181935
 */

public class Ex03 {
	
	/**
	 * 문제 설명
	 * 1. 양의 정수 n이 주어질 때 
	 * 2. n이 홀수일 경우 n 이하의 홀수인 정수의 합을 return
	 * 3. n이 짝수일 경우 n 이하의 짝수의 제곱의 합을 return
	 */
	
	// 풀이 1. if 문 사용
	// 시간 0.01ms ~ 0.03ms
	public int solution(int n) {
		
		int answer = 0;
		
		if(n % 2 != 0) {
			for(int i = 1; i <= n; i += 2) {
				answer += i;
			}
		}else {
			for(int i = 2; i <= n; i += 2) {
				answer += i * i;
			}
		}
		
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		Ex03 ex04 = new Ex03();
		
		System.out.println(ex04.solution(10));
	}

}
