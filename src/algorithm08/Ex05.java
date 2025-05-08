package algorithm08;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/12948
 */

public class Ex05 {
	
	/**
	 * 문제 설명
	 * 1. 번호가 주어질 때 뒤 4자리를 제외한 나머지를 "*"로 가린 문자열 return
	 */

	
	// 풀이 . replace 사용
	// 시간 1.14ms ~ 1.65ms
	public String solution(String phone_number) {
		
		String num = phone_number.substring(phone_number.length() -4, phone_number.length());
		
		phone_number = phone_number.replaceAll("[0-9]", "*").substring(0, phone_number.length() -4);
		
		return phone_number + num;
	}
	
	
	public String solution1(String phone_number) {
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < phone_number.length() -4; i++) {
			sb.append("*");
		}
		
		return sb.toString() + phone_number.substring(phone_number.length() -4, phone_number.length());
	}
	
	
	
	public static void main(String[] args) {
		Ex05 ex05 = new Ex05();
		System.out.println(ex05.solution1("01033334444"));
	}
		
}
