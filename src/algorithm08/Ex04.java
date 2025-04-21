package algorithm08;

import java.util.Arrays;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/120897
 */

public class Ex04 {
	
	/**
	 * 문제 설명
	 * 1. 정수 n이 주어질 때
	 * 2. 정수 n의 약수를 담은 배열을 return
	 */
	
	
	// 풀이
	// 시간 0.03ms ~ 0.31ms
	public int[] solution(int n) {
		
		int[] arr = new int[n];
		int j = 0;
		
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				arr[j] = i;
				j++;
			}
		}
		
		return arr = Arrays.copyOf(arr, j);
	}

}
