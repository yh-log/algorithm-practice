package algorithm08;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/12925
 */

public class Ex03 {
	
	/**
	 * 문제 설명
	 * 1. 문자열 s를 숫자로 변환해 return
	 * 	▶ 맨 앞에는 부호가 올 수 있으며, 0으로 시작하지 않음
	 */
	
	
	// 풀이
	// 시간 0.02ms ~ 0.05ms
	public int solution(String s) {
		
		return Integer.parseInt(s);
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		Ex03 ex03 = new Ex03();
		System.out.println(ex03.solution("-12345"));
	}

}
