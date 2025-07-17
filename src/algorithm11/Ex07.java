package algorithm11;

// https://school.programmers.co.kr/learn/courses/30/lessons/70128

public class Ex07 {
	
	/*
	 * 문제 설명 (Lv.1 내적)
	 * 1. 배열 2개를 내적을 return
	 * - 카다시안 곱
	 */
	
	
	/**
	 * 방법
	 * - 반복문으로 배열 순회하며 값을 계산
	 */
	
	
	// 풀이
	// 시간 0.02ms ~ 0.06ms
	public int solution(int[] a, int[] b) {
		
		int sum = 0;
		
		for(int i = 0; i < a.length; i++) {
			sum += a[i] * b[i];
		}
		
		return sum;
	}

}
