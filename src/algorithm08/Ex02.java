package algorithm08;

import java.util.Arrays;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/12954
 */

public class Ex02 {
	
	/**
	 * 문제 설명 
	 * 1. 정수 x와 n이 있을 때
	 * 2. x * n 까지의 수를 배열로 return
	 */
	
	// 풀이
	// 시간 0.01ms ~ 0.03ms 
	public long[] solution(int x, int n) {
		
		long[] arr = new long[n];
		
		for(int i = 1, j = 0; i <= n; i++, j++) {
			arr[j] = (long) x * i;
		}
		
		return arr;
	}
	
	
	
	public static void main(String[] args) {
		Ex02 ex02 = new Ex02();
		System.out.println(Arrays.toString(ex02.solution(4, 5)));
	}

}
