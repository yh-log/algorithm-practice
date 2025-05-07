package algorithm04;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/120851
 */

public class Ex02 {
	
	/**
	 * 문제 설명
	 * 1. 문자열 배열에 숫자의 합을 return
	 */
	
	// 풀이. isdigit 사용
	// 시간 7.38ms ~ 21.61ms
	public int solution(String my_string) {
		
		int sum = 0;
		
		for(int i = 0; i < my_string.length(); i++) {
			
			char ch = my_string.charAt(i);
			
			if(Character.isDigit(ch)) {
				System.out.println(ch + " = " + sum);
				sum += Integer.parseInt(String.valueOf(ch));
			}
		}
		
		return sum;
	}
	
	
	public static void main(String[] args) {
		Ex02 ex02 = new Ex02();
		System.out.println(ex02.solution("aAb1B2cC34oOp"));
	}

}
