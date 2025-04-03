package algorithm03;

import java.util.Arrays;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/120819
 */

public class Ex03 {
	
	/**
	 * 문제 설명
	 * 1. 주어진 돈을 가지고 5500원 음료를 최대로 마실 수 있는 음료의 수와
	 * 2. 구매 후 남은 돈의 순서를 담은 배열을 return
	 *  => [잔 수, 남은 돈]
	 */

	// 풀이 1
	// 시간 0.01ms ~ 0.02ms
	public int[] solution(int money) {
		
		int[] arr = new int[2];
		
		arr[0] = money / 5500;
		arr[1] = money - (5500 * arr[0]);
		
		
		return arr;
	}
	
	// 풀이 2
	public int[] solution1(int money) {
		return new int[] {money / 5500, money % 5500};
	}
	
	
	public static void main(String[] args) {
		Ex03 ex03 = new Ex03();
		
		System.out.print(Arrays.toString(ex03.solution1(15000)));
	}
}
