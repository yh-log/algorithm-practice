package algorithm05;

import java.util.Arrays;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/120911
 */

public class Ex05 {
	
	/**
	 * 문제 설명
	 * 1. 대소문자인 문자열을 
	 * 2. 모두 소문자로 바꾸고
	 * 3. 알파벳 순서(오름차순)로 정렬해 return
	 */
	
	
	// 풀이
	// 시간 0.16ms ~0.66 ms 
	public String solution(String my_string) {
        
		
		String[] arr = my_string.toLowerCase().split("");
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		
		for(String str : arr) {
			sb.append(str);
		}
		
        return sb.toString();
    }
	
	
	// 풀이 2
	// 시간 0.33ms ~ 0.49ms
	public String solution1(String my_string) {
        
		char[] ch = my_string.toLowerCase().toCharArray();
		Arrays.sort(ch);

		return new String(ch);
    }
	
	
	
	public static void main(String[] args) {
		Ex05 ex05 = new Ex05();
		
		System.out.println(ex05.solution("Bcad"));
	}

}
