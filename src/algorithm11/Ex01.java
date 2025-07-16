package algorithm11;

import java.util.Arrays;
import java.util.stream.IntStream;

// https://school.programmers.co.kr/learn/courses/30/lessons/181891

public class Ex01 {
	
	/*
	 * 문제 설명 (순서 바꾸기)
	 * 1. 배열과 정수가 주어질 때
	 * 2. 정수 n을 기준으로 n번째 이후 원소를 앞으로, 그 이전 원소를 뒤에 붙인 배열을 return
	 */
	
	
	// 풀이
	// 시간 1.62ms ~ 3.52ms
	public int[] solution(int[] num_list, int n) {
		
		return IntStream.concat(Arrays.stream(Arrays.copyOfRange(num_list, n, num_list.length)), 
				Arrays.stream(Arrays.copyOfRange(num_list, 0, n))).toArray();
	}
	
	
	
	public static void main(String[] args) {
		Ex01 ex01 = new Ex01();
		int[] arr = {5, 2, 1, 7, 5};
		System.out.println(Arrays.toString(ex01.solution(arr, 3)));
	}

}
