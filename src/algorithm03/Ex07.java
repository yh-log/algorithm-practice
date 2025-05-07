package algorithm03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/181888
 */

public class Ex07 {
	
	/**
	 * 문제 설명
	 * 1. num_list와 정수 n이 주어질 때
	 * 2. list의 첫 번째 ~ 마지막 원소까지 n개 간격으로 저장되어 있는
	 * 3. 원소를 담은 리스트를 return
	 */
	
	// 풀이 1. for문 사용
	// 시간 0.02ms ~ 0.03ms
	public int[] solution(int[] num_list, int n) {
		
		int[] answer = new int[num_list.length];
		int j = 0;
		
		for(int i = 0; i < num_list.length; i += n) {
			answer[j] = num_list[i];
			j++;
		}
		return Arrays.copyOf(answer, j);
	}
	
	
	// 풀이 2. List 로 만들어서 풀이
	// 시간 1.83ms ~ 3.34ms
	public int[] solution1(int[] num_list, int n) {
		
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < num_list.length; i += n) {
			list.add(num_list[i]);
		}
		
		return list.stream().mapToInt(i -> i).toArray();
	}
	
	
	public static void main(String[] args) {
		Ex07 ex03 = new Ex07();
		
		int[] num_list = {4, 2, 6, 1, 7, 6};
		System.out.println(Arrays.toString(ex03.solution1(num_list, 2)));
	}

}
