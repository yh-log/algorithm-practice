package algorithm04;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/120893
 */

public class Ex06 {
	
	/**
	 * 문제 설명
	 * 1. 대문자는 소문자로
	 * 2. 소문자는 대문자로 바꿔 return
	 */
	
	// 풀이 1
	// 시간 0.08ms ~ 1.32ms
	// 소문자 는 97부터 시작
	public String solution(String my_string) {
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < my_string.length(); i++) {
			char ch = my_string.charAt(i);
			
			if(ch >= 97) {
				sb.append(String.valueOf(ch).toUpperCase());
			}else {
				sb.append(String.valueOf(ch).toLowerCase());
			}
			
		}
		
		return sb.toString();
	}
	
	
	
	
	
	public static void main(String[] args) {
		Ex06 ex01 = new Ex06();
		
		System.out.println(ex01.solution("cccCCC"));
	}

}
