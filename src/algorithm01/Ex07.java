package algorithm01;

import java.util.stream.Collectors;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/120849
 */

public class Ex07 {
	
	/**
	 * 문제 설명
	 * 1. a, e, i, o, u (모음)이 매개변수로 주어질 경우
	 * 2. 모음을 제거한 문자열을 return
	 */
	
	// 풀이 1. replaceAll() 사용
	// 시간 0.09ms ~ 0.13ms
    public String solution(String my_string) {
        
    	return my_string.replaceAll("[aeiou]", "");
    }
    
    // 풀이 2. stream 사용
    // 시간 1.92ms ~ 14.88ms
    public String solution2(String my_string) {
        
    	return my_string.chars()
    					.filter(x -> "aeiou".indexOf(x) == -1)
    					.mapToObj(x -> String.valueOf((char)x))
    					.collect(Collectors.joining());
    }
    
    public static void main(String[] args) {
    	Ex07 ex02 = new Ex07();
    	
    	System.out.println(ex02.solution("bus"));
    }

}
