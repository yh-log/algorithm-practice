package algorithm07;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/87389
 */

public class Ex04 {

	/**
	 * 문제 설명
	 * 1. n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return
	 */
	
	
	/**
	 * 풀이 고민
	 * 1. 수가 홀수일 경우에는 항상 3이 되는가? no
	 * 2. 수가 짝수일 경우에는 본인 수 -1이 유일한가? no
	 * 3. 그렇다면 반복문으로 하나씩 수를 더할 경우 시간 복잡도가 문제일 수 있음
	 * 4. 
	 */
	
	// 풀이
	// 시간 0.01ms ~ 4.75ms
	public int solution(int n) {
		
		int x = 1;
		
//		for(int i = 2; i <= 1000000; i++) {
//			if(n % i == 1) {
//				x = i;
//				break;
//			}
//		}
		
		while(n % x != 1) {
			x++;
		}
		
		return x;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		Ex04 ex04 = new Ex04();
		System.out.println(ex04.solution(10));
		System.out.println(ex04.solution(12));
		
		
		System.out.println();
		
		System.out.println(3 % 2);
	}
	
}
