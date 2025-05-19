package algorithm09;

import java.util.Arrays;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181885
 */

public class Ex04 {

	/**
	 * 문제 설명
	 * 1. 문자열 배열과 boolean 배열이 주어질 때
	 * 2. boolean 배열에 false인 인덱스와 동일한 문자열 배열을 return
	 */
	
	
	// 풀이
	// 시간 0.02ms ~ 0.06ms
	public String[] soution(String[] todo_list, boolean[] finished) {
		
		String[] answer = new String[todo_list.length];
		int j = 0;
		
		for(int i = 0; i < finished.length; i++) {
			if(finished[i] == false) {
				answer[j] = todo_list[i];
				j++;
			}
		}
		return Arrays.copyOf(answer, j);
	}
	
	
	
	
	
	public static void main(String[] args) {
		Ex04 ex04 = new Ex04();
		String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
		boolean[] finished = {true, false, true, false};
		
		System.out.println(Arrays.toString(ex04.soution(todo_list, finished)));
	}
	
}
