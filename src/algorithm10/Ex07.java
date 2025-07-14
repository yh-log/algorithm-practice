package algorithm10;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/12917

public class Ex07 {
	
	/**
	 * 문제 설명 (Lv.1 문자열 내림차순으로 배치하기)
	 * 1. 문자를 큰것부터 작은 순으로 return
	 * 2. 대문자는 소문자보다 작은 것
	 */
	
	/**
	 * 방법 고민
	 * 1. 문자를 하나씩 분리해서 오름차순 -> 내림차순으로 정리
	 */
	
	
	// 풀이
	// 시간 0.29ms ~ 2.45ms
	public String solution(String s) {
		
		String[] strArr = s.split("");
		
		Arrays.sort(strArr);
		
		StringBuilder sb = new StringBuilder();
		
		for(String str : strArr) {
			sb.append(str);
		}
		
		return sb.reverse().toString();
	}
	
	
	
	
	public static void main(String[] args) {
		Ex07 ex07 = new Ex07();
		System.out.println(ex07.solution("Zbcdefg"));
	}

}
