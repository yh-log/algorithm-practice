package algorithm03;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/181877
 */
public class Ex05 {
	
	/**
	 * 문제 설명
	 * 1. 알파벳을 모두 대문자로 바꿔 return
	 */
	
	// 풀이. toUpperCase() 사용 * 반대는 toLowerCase
	// 시간 0.02ms ~ 0.03ms
	public String solution(String myString) {
        return myString.toUpperCase();
    }

}
