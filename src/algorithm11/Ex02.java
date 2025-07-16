package algorithm11;

// https://school.programmers.co.kr/learn/courses/30/lessons/181901

public class Ex02 {
	
	/*
	 * 문제 설명 (배열 만들기 1)
	 * 1. 정수 n과 k 가 있을 때
	 * 2. 1이상 n 이하의 정수 중 k의 배수를 오름차순으로 정렬한 배열 return
	 */
	
	
	// 풀이
	// 시간 0.01ms ~ 0.06ms
	public int[] solution(int n, int k) {
		
		int arr[] = new int[n / k];
		
		int j = 0;
		
		for(int i = k; i < n; i += k, j++) {
			arr[j] = i;
		}
		
		return arr;
	}

}
