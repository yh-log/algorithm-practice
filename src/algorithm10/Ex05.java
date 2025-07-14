package algorithm10;

import java.util.Arrays;
import java.util.Collections;

// https://school.programmers.co.kr/learn/courses/30/lessons/12933

public class Ex05 {

	/**
	 * 문제 설명 (Lv.1 정수 내림차순으로 배치하기)
	 * 1. 정수를 내림차순으로 정렬하여 return
	 */
	
	/**
	 * 방법 고민
	 * 1. reversOrder() 사용 - long으로 변환해주기 위해 StringBuilder 사용
	 * 2. 함수 없이?
	 */
	
	
	// 풀이 1
	// 시간 0.30ms ~ 1.00ms
	public long solution(long n) {
		
		Long[] arr = new Long[String.valueOf(n).length()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] =  n % 10;
			n /= 10;
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		StringBuilder sb = new StringBuilder();
		
		for(long l : arr) {
			sb.append(l);
		}
		
	
		return Long.parseLong(sb.toString());
	}
	
	// 풀이 2
	// 시간 0.16ms ~ 0.20ms
	public long solution1(long n) {
		
		String[] arr = String.valueOf(n).split("");
		
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		
		for(String str : arr) {
			sb.append(str);
		}
		
		return Long.parseLong(sb.reverse().toString());
	}
	
	
	
	
	public static void main(String[] args) {
		Ex05 ex05 = new Ex05();
		System.out.println(ex05.solution1(12345));
	}
	
}
