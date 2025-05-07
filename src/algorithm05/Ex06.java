package algorithm05;

import java.util.Arrays;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/181867
 */

public class Ex06 {
	
	/**
	 * 문제 설명
	 * 1. 문자열을 "x"를 기준으로 나눴을 때 
	 * 2. 각각의 길이를 저장한 배열을 return
	 */
	
	
	// 풀이
	// 시간 0.08ms ~ 4.15ms
	public int[] solution(String myString) {
		
		// -1 넣어서 빈 문자열도 포함
		String[] arr = myString.split("x", -1);
		int [] num = new int[arr.length];

		
		for(int i = 0; i < arr.length; i++) {
			
			num[i] = arr[i].length();
			
		}
		
		return num;
	}
	
	
	
	public static void main(String[] args) {
		Ex06 ex01 = new Ex06();
		
		System.out.println(Arrays.toString(ex01.solution("xabcxdefxghi")));
	}
	

}
