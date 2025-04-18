package algorithm07;

import java.util.Arrays;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/120862
 */

public class Ex01 {
	
	/**
	 * 문제 설명
	 * 1. numbers 배열이 주어질 때
	 * 2. 원소 중 2개를 곱해 만들 수 있는 최댓값을 return
	 */
	
	
	// 풀이 1. 이중 for문 사용 (버블 알고리즘 (선택))
	// 시간 8.70ms ~ 10.78ms
	public int solution(int[] numbers) {
		
		// 기존에 최소값을 문제에서 나올 수 있는 가장 최소의 수로 설정
		int max = -10000 * 10000;
		
		
		for(int i = 0; i < numbers.length -1; i++) {
			int n = 0;
			for(int j = 1; j < numbers.length; j++) {
				if(i != j) {
					n = numbers[i] * numbers[j];
				}
				System.out.println(numbers[i] + " * " + numbers[j] + " = " + n);
				if(n > max) {
					max = n;
				}
			}
		}
		
		return max;
	}
	
	// 풀이 2. 수학적 접근!!
	// 설명 ▶ 음수가 있기 때문에 정렬할 경우 맨 앞 2개, 맨 뒤 2개 중 하나가 최대수임
	// 시간 0.33ms ~ 0.47ms
	public int solution1(int[] numbers) {
		
		Arrays.sort(numbers);
		int index = numbers.length - 1;
		return Math.max(numbers[0] * numbers[1], numbers[index] * numbers[index -1]);
		
	}
	
	
	
	
	public static void main(String[] args) {
		Ex01 ex01 = new Ex01();
		int[] numbers = {1, 2, 0};
		System.out.println(ex01.solution(numbers));
	}

}
