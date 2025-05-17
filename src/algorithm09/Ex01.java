package algorithm09;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181920?language=java
 */

public class Ex01 {
	
	/**
	 * 문제 설명
	 * 1. a ~ b 까지 숫자를 담은 배열을 return
	 */
	
	
	// 풀이
	// 시간 0.01ms ~ 0.03ms
	public int[] solution(int start_num, int end_num) {
		
		int[] answer = new int[end_num - start_num + 1];
		
		for(int i = start_num, j = 0; i <= end_num; i++, j++) {
			answer[j] = i;
		}
		
		return answer;
	}

}
