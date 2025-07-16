package algorithm11;


// https://school.programmers.co.kr/learn/courses/30/lessons/181906

public class Ex03 {
	
	/*
	 * 문제 설명 (접두사인지 확인하기)
	 * 1. 접두사면 1, 아니면 0
	 */
	
	/*
	 * 방법 고민
	 * 1. 일단 문자열이 정확히 일치하면 접두사
	 * 2. 개수는 달라도 앞에서부터 시작하면 접두사
	 * 
	 * -> contains 로 풀면 안되고, 
	 * -> 접두사로 주어진 문자열의 길이만큼 기존 문자열을 분리하고
	 * -> equals로 true이면 접두사 아니면 아님
	 */
	
	
	// 풀이 1
	// 시간 0.02ms ~ 0.04ms
	public int solution(String my_string, String is_prefix) {
		
		
		if(my_string.length() >= is_prefix.length() 
				&& my_string.substring(0, is_prefix.length()).equals(is_prefix)) {
			return 1;
		}
		
		return 0; 
	}

	
	public static void main(String[] args) {
		Ex03 ex03 = new Ex03();
		System.out.println(ex03.solution("banana", "bananan"));
	}
}
