package algorithm01;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/120898
 */

public class Ex09 {
	
	/**
	 * 문제 설명
	 * 1. 한 글자 당 2cm로 작성할 경우
	 * 2. message를 적기 위한 편지지의 최소 가로 길이 return
	 */
	
	// 풀이 1
	// 시간 0.02ms ~ 0.03ms
    public int solution(String message) {
        return message.length() * 2;
    }
    
    
    
    public static void main(String[] args) {
    	Ex09 ex04 = new Ex09();
    	System.out.println(ex04.solution("happy birthday!"));
    	System.out.println(ex04.solution("I love you~"));
    }

}
