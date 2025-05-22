package algorithm09;

// https://school.programmers.co.kr/learn/courses/30/lessons/181898

public class Ex07 {
	
	/**
	 * 문제 설명
	 * 1. 0과 1로만 이루어진 정수 배열이 주어질 때
	 * 2. idx 보다 index가 크면서 값이 1인 가장 작은 인덱스를 return
	 * 3. 없을 경우 -1을 return
	 */
	
	// 풀이
	// 시간 0.01ms ~ 0.02ms
	public int solution(int[] arr, int idx) {
		
		for(int i = idx; i < arr.length; i++) {
			if(arr[i] == 1) {
				return i;
			}
		}
		return -1;
	}

}
