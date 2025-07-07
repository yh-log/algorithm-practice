package algorithm10;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/12933

public class Ex04 {
	
	/**
	 * 문제 설명
	 * 1. 주어진 정수를 내림차순으로 정렬하여 return
	 */
	
	
	
	/*
	 * 풀이 고민
	 * 방법 1. 일단 배열에 넣고, 오름차순 정렬한 후 뒤에서부터 값 추가해 return
	 */

	
	// 풀이 1
	// 시간 ms ~ ms
	public long solution(long n) {
		
		String sum = "";
		
		int[] arr = new int[String.valueOf(n).length()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int) (n % 10);
			n /= 10;
		}
		
		Arrays.sort(arr);

		for(int i = arr.length -1; i >= 0; i--) {
			sum = arr[i] + "";
		}
		
		return Long.parseLong(sum);
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Ex04 ex07 = new Ex04();
		System.out.println(ex07.solution(118372));
	}

}
