package algorithm05;

import java.util.Scanner;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/120823
 */

public class Ex03 {

	/**
	 * 문제 설명
	 * 1. * 의 높이와 너비를 1 이라고 했을 때
	 * 2. * 을 이용해 이등변 삼각형을 그리려고 한다.
	 * 3. 정수 n이 주어지면 높이와 너비가 n 인 직각 이등변 삼각형을 print
	 */
	
	// 시간 157.43ms ~232.18 ms 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		// 풀이 1
		for(int i = 1; i <= n; i++) {

			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		
		}
		
		// 풀이 2. repeat 함수를 사용해 "*" 을 i번 반복해준다.
		for(int i = 1; i <= n; i++) {
			System.out.println("*".repeat(i));
		}
		
	}
	
}
