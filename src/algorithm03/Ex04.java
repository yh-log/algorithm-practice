package algorithm03;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/120837
 */

public class Ex04 {
	
	/**
	 * 문제 설명 (그리디 알고리즘 문제)
	 * 1. 장군 개미는 5, 병졍 개미는 3, 일개미는 1
	 * 2. 사냥감의 hp에 따라 최소한의 병령을 구성할 경우
	 * 3. 개미의 수를 return
	 */
	
	// 풀이 1. 나눈 값을 변수에 저장하고, 나머지 값을 hp에 저장하는 방법
	// 시간 0.01ms ~ 0.02ms
	public int solution(int hp) {
			
		int count = hp / 5;
		hp %= 5;
		
		count += hp / 3;
		hp %= 3;
		
		count += hp;
		
		return count;
	}
	
	// 풀이 2. 배열과 반복문으로 풀이
	// 시간 0.01ms ~ 0.02ms
	public int solution1(int hp) {
		
		int[] power = {5,3,1};
		int count = 0;
		
		
		for(int num : power) {
			count += hp / num;
			hp %= num;
		}
		
		
		return count;
	}
	
	
	
	public static void main(String[] args) {
		Ex04 ex04 = new Ex04();
		System.out.println(ex04.solution(999));
		
	}

}
