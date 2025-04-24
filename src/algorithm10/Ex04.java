package algorithm10;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/12922
 */

public class Ex04 {
	
	/**
	 * 문제 설명
	 * 1. 길이가 n이고 "수박수박수..."의 패턴을 유지하는 문자열을 return
	 */
	
	
	// 풀이
	// 시간 0.13ms ~ 0.49ms
	public String solution(int n) {
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			if(i % 2 == 0) {
				sb.append("수");
			}else {
				sb.append("박");
			}
		}
		
		return sb.toString();
	}

}
