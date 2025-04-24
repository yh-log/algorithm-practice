package algorithm11;

import java.util.Arrays;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/12910
 */

public class Ex04 {
	
	/**
	 * 문제 설명
	 * 1. 배열의 값 중 divisor로 나누어 떨어지는 값을
	 * 2. 오름차순으로 정렬한 배열을 return
	 * 3. 만약 하나도 없을 경우 배열에 -1을 담아 return
	 */
	
	
	// 풀이
	// 시간 0.16ms ~ 1.46ms
	public int[] solution(int[] arr, int divisor) {
		
		int[] numList = new int[arr.length];
		numList[0] = -1;
		int j = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % divisor == 0) {
				numList[j] = arr[i];
				j++;
			}
		}
		
		if(j == 0) {
			return Arrays.copyOf(numList, 1);
		}
		
		
		numList = Arrays.copyOf(numList, j);
		Arrays.sort(numList);
		
		
		return numList;
	}
	
	
	
	
	public static void main(String[] agrs) {
		Ex04 ex04 = new Ex04();
		int[] arr = {2,3,4};
//		int[] arr = {5, 9, 7, 10};
		System.out.println(Arrays.toString(ex04.solution(arr, 5)));
	}

}
