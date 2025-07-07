package algorithm09;

import java.util.Arrays;

//링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181899?language=java
public class Ex09 {
	
	/*
	 * 문제 설명
	 * 1. start_num과 end_num이 주어질 때
	 * 2. start_num에서 end_num까지 1씩 감소하는 수를 담은 리스트를 return
	 */
	
	// 풀이 1
	// 실행시간 0.01ms ~ 0.03ms
	public int[] solution(int start_num, int end_num) {
		
		int[] arr = new int[start_num - end_num + 1];
				
		for(int i = start_num, j = 0; i >= end_num; i--, j++) {
			arr[j] = i;
		}
		
		return arr;
	}
	
	
	
	
	public static void main(String[] args) {
		Ex09 ex01 = new Ex09();
		System.out.println(Arrays.toString(ex01.solution(10, 1)));
	}

}
