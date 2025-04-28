package algorithm13;

import java.util.Arrays;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/12932
 */

public class Ex05 {
	
	/**
	 * 문제 설명
	 * 1. 자연수 n을 뒤집어 배열로 return
	 */
	
	
	/**
	 * 방법 고민
	 * 1. n을 String으로 만들어 준다.
	 * 2. 숫자로 접근 
	 *    → n을 % 10으로 해 남은 나머지를 배열에 넣어주고
	 * 	  → 종료 후 n / 10을 해서 1의 자리 날려주기
	 */
	
	// 풀이 1. 숫자로 접근 ▶ 메모리 초과!!
	// 시간 ms ~ ms
	public int[] solution(long n) {
		
		int[] arr = new int[(int)n];
		int j = 0;
		
		while(n > 0) {
			arr[j] = (int) n % 10;
			n /= 10;
			j++;
		}
		
		
		return Arrays.copyOf(arr, j);
	}
	
	
	// 풀이 2. String으로 변환
	// 시간 0.04ms ~ 0.05ms
	public int[] solution1(long n) {
		
		String str = String.valueOf(n);
		int[] arr = new int[str.length()];
		
		
		for(int i = str.length() -1, j = 0; i >= 0; i--, j++) {
			arr[j] = Integer.parseInt(String.valueOf(str.charAt(i)));
		}
		
		return arr;
	}
	
	// 풀이 2. StirngBuilder에 reverse() 사용
	// 시간 0.08ms ~ 0.11ms
	public int[] solution2(long n) {
		
		StringBuilder sb = new StringBuilder();
		sb.append(n).reverse();
		
		int[] arr = new int[sb.length()];
		
		for(int i = 0; i < sb.length(); i++) {
			arr[i] = Integer.parseInt(String.valueOf(sb.charAt(i)));
		}
		
		return arr;
	}
	
	
	
	
	
	public static void main(String[] args) {
		Ex05 ex05 = new Ex05();
		System.out.println(Arrays.toString(ex05.solution(12345)));
	}

}
