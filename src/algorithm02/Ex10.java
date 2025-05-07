package algorithm02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/120813
 */

public class Ex10 {
	
	/**
	 * 문제 설명
	 * 1. 정수 n 이 주어질 때 n 이하의 홀수가
	 * 2. 오름차순으로 담긴 배열 return
	 */
	
	// 풀이 1. List로 받아서 홀수만 체크
	// 시간 1.99ms ~ 2.46ms
	public int[] solution(int n) {

		List<Integer> arr = new ArrayList<Integer>();
		
		for(int i = 1; i <= n; i += 2) {
			if(i % 2 != 0) {
				arr.add(i);
			}
		}
		
		return arr.stream().mapToInt(Integer::valueOf).toArray();
		
	}
	
	// 풀이 2. 미리 계산하기
	// 시간 0.01ms ~ 0.02ms
	public int[] solution1(int n) {
		
		int[] arr = new int[(n+1) / 2];
		
		
		for(int i = 0, num = 1; num <= n; i++, num += 2) {
			arr[i] = num;
		}
		
		return arr;
		
	}
	
	
	
	public static void main(String[] args) {
		Ex10 ex05 = new Ex10();
		System.out.println(Arrays.toString(ex05.solution1(10)));
	}

}
