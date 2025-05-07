package algorithm07;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/12947
 */

public class Ex09 {
	
	/**
	 * 문제 설명
	 * 1. 주어진 정수 n의 자리수의 합으로
	 * 2. n이 나눠질 경우 하샤드 수
	 * 3. 하샤드 수일 경우 true 아닐 경우 false
	 * ※ 하샤드 수 : ex. 12의 자릿수의 합은 3으로 12는 3으로 나눠지므로 하샤드 수이다.
	 */
	
	
	/**
	 * 방법 고민
	 * 1. 반복문을 통해 x의 수를 한자리 씩 분리하며 더해준다.
	 * 2. 더해진 수가 x와 나눠서 0이 될 경우 true return
	 */
	
	// 풀이
	// 시간 0.02ms ~ 0.04ms 
	public boolean solution(int x) {
		
		int y = 0;
		int n = x;
		
		while(x > 0) {
			y += x % 10;
			x /= 10;
		}
		
		return (n % y == 0) ? true : false;
	}
	
	
	
	public static void main(String[] args) {
		Ex09 ex04 = new Ex09();
		System.out.println(ex04.solution(11));
	}

}
