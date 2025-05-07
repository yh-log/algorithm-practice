package algorithm02;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/120908
 */

public class Ex06 {
	
	/**
	 * 문제 설명
	 * 1. 문자열 a 와 b가 주어질 때
	 * 2. a 안에 b가 있다면 1 , 없다면 2를 return
	 */
	
	// 풀이 1.
	// 시간 0.02ms ~ 0.02ms
	public int solution(String str1, String str2) {
		
		if(str1.contains(str2)) {
			return 1;
		}
		
		return 2;
	}
	
	
	// 풀이 2. 삼항 연잔사 활용
	// 시간 0.01ms ~ 0.02ms
	public int solution1(String str1, String str2) {
		return str1.contains(str2)? 1 : 2;
	}
	
	public static void main(String[] args) {
		Ex06 ex01 = new Ex06();
		
		System.out.println(ex01.solution1("ab6CDE443fgh22iJKlmn1o", "6CD"));
		System.out.println(ex01.solution1("ppprrrogrammers", "pppp"));
		
	}

}
