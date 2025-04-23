package algorithm10;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/181875
 */

public class Ex03 {
	
	/**
	 * 문제 설명
	 * 1. 배열의 홀수 인덱스는 대문자로
	 * 2. 배열의 짝수 인덱스는 소문자로 return
	 */
	
	
	// 풀이
	// 시간 0.02ms ~ 0.08ms
	public String[] solution(String[] strArr) {
		
		for(int i = 0; i < strArr.length; i++) {
			if(i % 2 != 0) {
				strArr[i] = strArr[i].toUpperCase();
			}else {
				strArr[i] = strArr[i].toLowerCase();
			}
		}
		
		return strArr;
	}

}
