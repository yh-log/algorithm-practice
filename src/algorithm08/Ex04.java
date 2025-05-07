package algorithm08;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/12912
 */

public class Ex04 {
	
	/**
	 * 문제 설명
	 * 1. 정수 a, b가 주어질 때
	 * 2. a와 b 사이에 속한 모든 정수의 합을 return
	 * 	※ a와 b가 같은 경우 둘 중 아무 수나 return
	 * 	※ a와 b의 대소는 정해져있지 않음
	 */
	
	
	// 풀이
	// 시간 0.08ms ~ 12.06ms
	public long solution(int a, int b) {
		
		
		long answer = 0;
		
		// a와 b가 같은 경우
		if(a == b) {
			return a;
		}
		
		// 1. a와 b의 대소 비교
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		
		// 2. a부터 b까지 1씩 증가하며 반복문 진행
		while(min <= max) {
			answer += min;
			min++;
		}
		
		
		
		return answer;
	}

}
