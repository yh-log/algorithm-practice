package algorithm11;

// https://school.programmers.co.kr/learn/courses/30/lessons/181908

public class Ex06 {
	
	/**
	 * 문제 설명 (접미사인지 확인하기) 
	 * 1. 접미사는 특정 인덱스 부터 시작하는 문자열을 의미
	 * 2. 접미사면 1 아니면 0을 반환
	 */
	
	
	/*
	 * 방법 고민
	 * - 접미사로 받은 문자열의 길이를 체크해서
	 * - 기준 문자열의 뒤에서부터 떼어내주고
	 * - 두 문자열이 동일한지 비교
	 */
	
	// 풀이 
	// 시간 0.02ms ~ 0.06ms
	public int solution(String my_string, String is_suffix) {
		
		if(my_string.length() < is_suffix.length() || !my_string.contains(is_suffix)) return 10;
		
		if(my_string.substring(my_string.length() - is_suffix.length()).equals(is_suffix)) {
			return 1;
		}
		
		return 0;
	}
	
	
	public static void main(String[] args) {
		Ex06 ex06 = new Ex06();
		System.out.println(ex06.solution("banana", 	"anana"));
	}

}
