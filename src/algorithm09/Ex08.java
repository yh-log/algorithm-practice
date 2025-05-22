package algorithm09;

//https://school.programmers.co.kr/learn/courses/30/lessons/181874

public class Ex08 {
	
	/**
	 * 문제 설명
	 * 1. 문자열에 a는 모두 대문자로
	 * 2. 다른 알파벳은 모두 소문자로 변환해 return
	 */
	
	// 모두 소문자로 바꾼 후 replace 사용
	
	// 풀이
	// 시간 0.06ms ~ 0.11ms
	public String solution(String myString) {
		
		return myString.toLowerCase().replaceAll("a", "A");
	}
	
	
	public static void main(String[] args) {
		Ex08 ex08 = new Ex08();
		System.out.println(ex08.solution("abstract algebra"));
		System.out.println(ex08.solution("PrOgRaMmErS"));
	}

}
