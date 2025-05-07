package algorithm07;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/181863
 */

public class Ex01 {
	
	/**
	 * 문제 설명
	 * 1. m 을 rn으로 변경한 문자열 return
	 */
	
	
	// 풀이
	// 시간 0.05ms ~ 0.09ms
	public String solution(String rny_string) {
		return rny_string.replaceAll("m", "rn");
	}

}
