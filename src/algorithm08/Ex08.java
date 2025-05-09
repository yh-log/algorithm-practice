package algorithm08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/12935
 */

public class Ex08 {
	
	/**
	 * 문제 설명
	 * 1. 가장 작은 수를 제거한 배열을 return
	 * 2. 빈배열인 경우 -1을 채워서 return
	 * 3. 배열의 순서는 바뀌지 않아야 한다.
	 */
	
	
	// 풀이
	// 시간 1.96ms ~ 8.34ms
	public int[] solution(int[] arr) {
		
		if(arr.length == 1) {
			
			int[] n = {-1};
			return n;
		}
		
		int min = 999;
		int j = 0;
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < arr.length; i++) {

			list.add(arr[i]);
			
			if(min > arr[i]) {
				min = arr[i];
				j = i;
			}
		}
		
		list.remove(j); 
		
		return list.stream().mapToInt(i -> i).toArray();
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		Ex08 ex08 = new Ex08();
		int[] arr = {4,3,2,1};
		System.out.println(Arrays.toString(ex08.solution(arr)));
	}

}
