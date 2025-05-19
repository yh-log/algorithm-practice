package algorithm09;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181940
 */

public class Ex05 {
	
	/**
	 * 문제 설명
	 * 1. 문자열과 정수가 주어질 때 
	 * 2. 문자열을 정수 번 반복한 문자열을 return
	 */
	
	
	// 풀이
	// 시간 ms ~ ms
	public String solution(String my_string, int k) {
		
		String str = "";
		
		for(int i = 0; i < k; i++) {
			str += my_string;
		}
	    return str;
	}
	
	
	public static void main(String[] args) {
		Ex05 ex05 = new Ex05();
		System.out.println(ex05.solution("ab ", 3));
	}

}
