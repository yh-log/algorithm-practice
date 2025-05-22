package algorithm09;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181871
 */

public class Ex06 {
	
	/**
	 * 문제 설명
	 * 1. 문자열 a와 b가 주어질 때
	 * 2. 문자열 a에 b가 포함된 수를 return
	 */
	
	// 풀이
	// 시간 0.02ms ~ 0.06ms
	public int solution(String myString, String pat) {
		
		int num = 0;
		int index = 0;
		
		while(myString.indexOf(pat, index) != -1) {
			num++;
			index = myString.indexOf(pat, index) + 1;
		}
		
		return num;
	}
	
	
	
	
	public static void main(String[] args) {
		Ex06 ex06 = new Ex06();
		System.out.println(ex06.solution("banana", "ana"));
		System.out.println(ex06.solution("aaaa", "aa"));
	}

}
