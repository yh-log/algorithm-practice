package algorithm07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/181861
 */

public class Ex02 {
	
	/**
	 * 문제 설명
	 * 1. 주어진 배열(정수)에 숫자를 숫자만큼 추가해준다.
	 * 2. 뒤에 넣어주어야 한다.
	 */
	
	
	/**
	 * 방식 고민
	 * 1. stack 구조 (뒤에서 넣어주는 구조
	 * 2. 반복문 실행
	 * */
	
	
	// 풀이 1. Arrays.fill() 사용
	// 시간 0.03ms ~ 0.19ms
	public int[] solution1(int[] arr) {
		
		int count = 0;
		
		for(int num : arr) {
			count += num;
		}
		
		int[] numArr = new int[count];

		int j = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			Arrays.fill(numArr, j, arr[i] + j, arr[i]);
			j += arr[i];
		}
		
		return numArr;
	}
	
	// 풀이 2. List, stream 사용
	// 시간 2.73ms ~ 4.91ms
	public int[] solution(int[] arr) {
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i]; j++) {
				list.add(arr[i]);
			}
			
		}
		
		return list.stream().mapToInt(i -> i).toArray();
	}

	
	public static void main(String[] args) {
		Ex02 ex02 = new Ex02();
		int arr[] = {1};
		
		System.out.println(Arrays.toString(ex02.solution1(arr)));
	}
	
	
	
	
}
