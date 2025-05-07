package algorithm04;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120895
 */

public class Ex07 {

	
	/**
	 * 문제 설명
	 * 1. 문자열과 정수 a, b가 주어질 때
	 * 2. 문자열의 a 인덱스와 b 인덱스 문자열을 바꾼 문자열을 return
	 */
	
	// 풀이
	// 시간 0.12ms ~ 0.13ms
	public String solution(String my_string, int num1, int num2) {
		
		String[] strArr = my_string.split("");
		StringBuilder sb = new StringBuilder();
		
		String str1 = strArr[num1];
		
		strArr[num1] = strArr[num2];
		
		strArr[num2] = str1;
		
		for(int i = 0; i < strArr.length; i++) {
			sb.append(strArr[i]);
		}
		
		return sb.toString();
	}
	
	
	// 풀이 2
	// 시간 0.02ms ~ 0.03ms
	public String solution1(String my_string, int num1, int num2) {
		String answer = "";
		
		char[] ch = my_string.toCharArray();
		
		ch[num1] = my_string.charAt(num2);
		ch[num2] = my_string.charAt(num1);
		
		answer = String.valueOf(ch);
		
		
		return answer;
		
	}
	
	
	public static void main(String[] args) {
		Ex07 ex02 = new Ex07();
		
		System.out.println(ex02.solution("I love you", 3, 6));
	}
}
