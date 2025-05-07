package algorithm05;

import java.util.Arrays;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/181870
 */

public class Ex07 {

	/**
	 * 문제 설명
	 * 1. 문자열 배열 속 "ab"를 포함하는 모든 문자열을 제거하고
	 * 2. 순서를 유지해 남은 문자열을 return
	 */
	
	
	// 풀이
	// 시간 0.02ms ~ 0.78ms
	public String[] solution(String[] strArr) {
		
		String[] arr = new String[strArr.length];
		int j = 0;
		
		for(int i = 0; i < strArr.length; i++) {
			if(!strArr[i].contains("ad")) {
				arr[j] = strArr[i];
				j++;
			}
		}
		
		return Arrays.copyOf(arr, j);
	}
	
}
