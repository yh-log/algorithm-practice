package algorithm12;

import java.util.Arrays;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/181853
 */

public class Ex05 {
	
	/**
	 * 문제 설명
	 * 1. 오름차순으로 숫자 5개만 return
	 */
	
	
	// 풀이
	// 시간 0.32ms ~ 0.51ms
	public int[] solution(int[] num_list) {
		
		Arrays.sort(num_list);
		
		return Arrays.copyOf(num_list, 5);
	}

}
