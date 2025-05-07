package algorithm03;

import java.util.Arrays;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/120811
 */

public class Ex01 {
	
	/**
	 * 문제 설명
	 * 1. 주어진 정수 배열 array가 있을 때
	 * 2. 중앙값을 찾아 return
	 *  ※ 배열의 길이는 홀수이다
	 */
	
	// 풀이 1. Arrays.sort() 로 배열 정렬 후 중앙 인덱스 반환
	// 시간 0.33ms ~0.52 ms
	public int solution(int[] array) {
		
		Arrays.sort(array);
		
		return array[array.length / 2];
	}
	
	
	// 풀이 2. 만약 홀수개가 아닌 짝수개로도 배열을 받는 경우의 풀이
	public int solution1(int[] array) {
		
		Arrays.sort(array);
		
		if(array.length % 2 == 0) {
			return (array[array.length / 2] + array[array.length / 2 - 1] / 2);
			
		}else {
			return array[array.length / 2];
		}
	}
	
	
	public static void main(String[] args) {
		Ex01 ex01 = new Ex01();
		int[] arr = {1, 2, 7, 10, 11};
		System.out.println(ex01.solution1(arr));
	}

}
