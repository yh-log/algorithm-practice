package algorithm08;


/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/181910
 */

public class Ex09 {
	
	/**
	 * 문제 설명
	 * 1. 문자와 정수가 주어질 때
	 * 2. 문자 + 숫자로 문자열을 return
	 */
	
	
	// 풀이
	// 시간 0.01ms ~ 0.02ms
	public String solution(String my_string, int n) {
		
		int num = my_string.length() - n;
		
		return my_string.substring(num);
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Ex09 ex09 = new Ex09();
		System.out.println(ex09.solution("ProgrammerS123", 11));
		
	}

}
