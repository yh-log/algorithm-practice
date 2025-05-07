package algorithm05;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/12918
 */

public class Ex04 {
	
	/**
	 * 문제 설명
	 * 1. 문자열의 길이가 4 또는 6이고 숫자로만 이루어져 있으면 true
	 * 2. 문자열의 길이가 4 또는 6이 아니고 문자가 있으면 false
	 */
	
	// 풀이
	// 시간 0.02ms ~ 0.03ms
	public boolean solution(String s) {
		
		boolean result = false;
		
		if(4 == s.length() || 6 == s.length()) {
			result = true;
			for(int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				if(!Character.isDigit(ch)) {
					result = false;
				}
			}
		}
		
		return result;
	}

}
