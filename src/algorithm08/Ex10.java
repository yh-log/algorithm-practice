package algorithm08;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/181878
 */

public class Ex10 {
	
	/**
	 * 문제 설명
	 * 1. 문자열 myString에 pat이 존재하면 1 아니면 0을 return
	 */
	
	
	// 풀이
	// 시간 0.03ms ~ 0.10ms
	public int solution(String myString, String pat) {
		
		myString = myString.toLowerCase();
		pat = pat.toLowerCase();
		
		if(myString.contains(pat)) {
			return 1;
		}
		
		return 0;
	}

}
