package algorithm02;

import java.util.Arrays;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/120809
 */

public class Ex09 {
	
	/**
	 * 문제 설명
	 * 1. 주어진 배열의 원소의 값을 2배로 계산해 return
	 */
	
	// 풀이
	// 시간 0.01ms ~ 0.04ms
	public int[] solution(int[] numbers) {
		 int[] answer = new int[numbers.length];
		 
		 for(int i = 0; i < numbers.length; i++) {
			 answer[i] = numbers[i] * 2;
		 }
		 
	        return answer;
	}
	
	
	
	public static void main(String[] args) {
		Ex09 ex04 = new Ex09();
		int[] arr = {1, 2, 3, 4, 5};
		
		System.out.println(Arrays.toString(ex04.solution(arr)));
	}

}
