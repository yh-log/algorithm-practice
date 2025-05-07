package algorithm05;

import java.util.Arrays;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/12950
 */

public class Ex10 {
	
	/**
	 * 문제 설명
	 * 1. 2차원 배열의 덧셈 결과를 return
	 */
	
	
	
	// 풀이
	// 시간 0.02ms ~ 8.51ms
	public int[][] solution(int[][] arr1, int[][]arr2){
		
		int[][] answer = new int[arr1.length][arr1[0].length];
		
		
		for(int i = 0; i < arr1.length; i++) {
			
			for(int j = 0; j < arr1[i].length; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];
				
			}
		}
		
		return answer;
	}
	
	
	
	public static void main(String[] args) {
		Ex10 ex05 = new Ex10();
//		int[][] arr1 = {{1,2},{2,3}};
//		int[][] arr2 = {{3,4},{5,6}};

		int[][] arr1 = {{1,2,5},{2,3,5}};
		int[][] arr2 = {{3,4,10},{5,6,10}};

		
//		int[][] arr1 = {{1},{2}};
//		int[][] arr2 = {{3},{4}};
		
		System.out.println(Arrays.deepToString(ex05.solution(arr1, arr2)));
	}

}
