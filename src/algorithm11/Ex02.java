package algorithm11;

import java.util.Arrays;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/86051
 */

public class Ex02 {
	
	/**
	 * 문제 설명
	 * 1. 0~9 까지 숫자 중 배열에 없는 숫자를 더해서 return
	 * 2. 모든 원소는 서로 다르다
	 */
	
	
	// 풀이
	// 시간 0.32ms ~ 0.48ms
	public int solution(int[] numbers) {
		
		Arrays.sort(numbers);
		int sum = 0;
		
		for(int i = 0; i <= 9; i++) {
			boolean isNum = false;
			for(int j = 0; j < numbers.length; j++) {
				System.out.println("동일 수  " + i  + " = " + numbers[j]);
				if(i == numbers[j]) {
					isNum = true;
					break;
				}
			}
			
			if(!isNum) {
				sum += i;
			}
		}
		
		
		return sum;
	}
	
	
	public static void main(String[] args) {
		Ex02 ex02 = new Ex02();
		
		int arr[] = {1,2,3,4,6,7,8,0};
		
		System.out.println(ex02.solution(arr));
		
	}

}
