package algorithm13;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/12903
 */

public class Ex03 {
	
	/**
	 * 문제 설명
	 * 1. 단어의 가운데 글자를 return
	 * 2. 홀수일 경우 중앙을
	 * 3. 짝수일 경우 가운데 2 글자를 return
	 */
	
	// 풀이
	// 시간 0.02ms ~ 1.79ms
	public String solution(String s) {
		
		int n = s.length() / 2;
		
		if(s.length() % 2 == 0) {
			return String.valueOf(s.charAt(n -1)) + String.valueOf(s.charAt(n));
		}
		
//		return String.valueOf(s.charAt(n));
		
		return (s.length() % 2 == 0) ? String.valueOf(s.charAt(n -1)) + String.valueOf(s.charAt(n)) : String.valueOf(s.charAt(n));
	}
	
	
	
	
	
	public static void main(String[] args) {
		Ex03 ex03 = new Ex03();
		
		System.out.println(ex03.solution("abcde"));
		System.out.println(ex03.solution("qwer"));
	}

}
