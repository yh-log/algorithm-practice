package algorithm04;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/120899
 */

public class Ex03 {
	
	/**
	 * 문제 설명
	 * 1. 정수 배열의 가장 큰 수와 그 수의 index return
	 */
	
	// 풀이
	// 시간 0.01ms
	public int[] solution(int[] array) {

		int max = array[0];
		
		int[] arr = {array[0], 0};
		
		for(int i = 1; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
				arr[0] = max;
				arr[1] = i;
			}
		}
		
		return arr;
	}

}
