package algorithm07;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/12916
 */

public class Ex08 {
	
	/**
	 * 문제 설명 (Lv.1)
	 * 1. 대문자와 소문자가 섞인 문자열에서
	 * 2. p의 개수와 y의 개수가 같으면 true, 다르면 false return
	 * ※ 대소문자 구분 x
	 */
	
	/**
	 * 방법 고민
	 * 1. 대소문자 구분 없으므로 모두 소문자 or 대문자로 변경
	 * 2. 
	 */
	
	
	// 풀이
	// 시간 0.03ms ~ 0.07ms
	public boolean solution(String s) {
		
		s = s.toLowerCase();
		
		int p = s.replace("p", "").length();
		int y = s.replace("y", "").length();
		
		return p == y ? true : false;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		Ex08 ex03 = new Ex08();
		System.out.println(ex03.solution("Pyyp"));
	}

}
