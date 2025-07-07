package algorithm10;

import java.util.Arrays;

// 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181882
public class Ex01 {
	
	/**
	 * 문제 설명
	 * 1. 배열 속 원소의 값이
	 * 2. 50보다 크거나 같은 짝수이면 2로 나누고
	 * 3. 50보다 작은 홀수는 2를 곱해준다.
	 * 4. 그 외 조건은 건들지 않음 (50보다 큰 홀수, 50보다 작은 짝수)
	 */
	
	
	// 풀이
	// 시간 0.01ms ~ 0.04ms
	public int[] solution(int[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] >= 50 && arr[i] % 2 == 0) {
				arr[i] = arr[i] / 2;
			}else if(arr[i] < 50 && arr[i] % 2 != 0) {
				arr[i] = arr[i] * 2;
			}
		}
		
		return arr;
	}

	
	
	public static void main(String[] args) {
		Ex01 ex03 = new Ex01();
		int[] arr = {1, 2, 3, 100, 99, 98};
		System.out.println(Arrays.toString(ex03.solution(arr)));
	}

}
