package algorithm08;

import java.util.Arrays;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/12944
 */

public class Ex01 {
	
	/**
	 * 문제 설명
	 * 1. 정부 배열의 평균 값을 return
	 */
	
	// 풀이 1. 배열 값 꺼내서 더한 후 평균 구하기
	// 시간 0.02ms ~ 0.04ms
	public double solution(int[] arr) {
		
		double avg = 0.0;
		
		for(int i = 0; i < arr.length; i++) {
			avg += arr[i];
		}
		
		
		return avg / arr.length;
	}
	
	
	// 풀이 2. stream
	// 시간 3.75ms ~ 4.98ms
	public double solution1(int[] arr) {
		
		return Arrays.stream(arr).mapToDouble(i -> i).average().getAsDouble();
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		Ex01 ex01 = new Ex01();
		int[] arr = {1,2,3,4};
		System.out.println(ex01.solution1(arr));
	}

}
