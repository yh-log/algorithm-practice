package algorithm10;

import java.util.Arrays;

// 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12939
public class Ex02 {
	
	/**
	 * 문제 설명 (Lv.1)
	 * 1. 공백으로 구부노딘 숫자들에서
	 * 2. 최솟값과 최댓값을 구해 문자열로 return 한다.
	 *   ※ -1 과 -4가 있을 경우 -4가 최소값이다. 
	 */
	
	/**
	 * 접근 방식
	 * 1. 공백으로 구분해 문자열 배열에 넣기
	 * 2. 정수 배열에 문자열을 숫자로 변환해 넣기
	 * 3. 정렬 후 0번, n-1 번 인덱스 값 return
	 * 
	 */
	
	
	// 풀이
	// 시간 7.71ms ~ 9.51ms
	public String solution(String s) {
		
		String strArr[] = s.split(" ");

		int[] arr = new int[strArr.length];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(strArr[i]);
		}
		
		Arrays.sort(arr);
		

		return arr[0] + " " + arr[arr.length -1];
    }
	
	// 풀이 2
	// 시간 6.68ms ~ 10.53ms
	public String solution1(String s) {
		
		String strArr[] = s.split(" ");
		
		int max, min, n;
		min = max = Integer.parseInt(strArr[0]);
		
		for(int i = 1; i < strArr.length; i++) {
			n = Integer.parseInt(strArr[i]);
			
			if(min > n) min = n;
			if(max < n) max = n;
		}
		
		return min + " " + max;
	}
	
	
	
	
	public static void main(String[] args) {
		Ex02 ex04 = new Ex02();

		System.out.println(ex04.solution("1 2 3 4"));
		System.out.println(ex04.solution("-1 -2 -3 -4"));
		System.out.println(ex04.solution("-1 -1"));

		
	}

}

