package algorithm06;

import java.util.Arrays;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/12919
 */

public class Ex03 {

	/**
	 * 문제 설명
	 * 1. String 배열 중 "Kim" 의 위치를 찾아
	 * 2. "김서방은 x에 있다" 는 String을 return
	 */
	
	
	// 풀이
	// 시간 5.24ms ~ 8.13ms
	public String solution(String[] seoul) {
		
		int x = 0;
		
		for(int i = 0; i < seoul.length; i++) {
			if(seoul[i].contains("Kim")) {
				x = i;
				break;
			}
		}
		
		return 	"김서방은 " + x + "에 있다";
	}
	
	
	// 풀이 2. indexOf() 사용
	// 시간 5.93ms ~ 7.82ms
	
	public String solution1(String[] seoul) {
		
		int x = Arrays.asList(seoul).indexOf("Kim");
		
		return 	"김서방은 " + x + "에 있다";
	}
	
}
