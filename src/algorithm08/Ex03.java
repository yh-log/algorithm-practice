package algorithm08;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/181849
 */

public class Ex03 {
	
	/**
	 * 문제 설명
	 * 1. 문자열로 이뤄진 정수의
	 * 2. 각 합을 return
	 */
	
	// 풀이
	// 시간 ms ~ ms
	public int solution(String num_str) {
		
		int sum = 0;
		
		for(int i = 0; i < num_str.length(); i++) {
			sum += Integer.parseInt(String.valueOf(num_str.charAt(i)));
		}
		
		return sum;
	}

}
