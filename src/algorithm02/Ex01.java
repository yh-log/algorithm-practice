package algorithm02;

import java.util.Arrays;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/120854
 */

public class Ex01 {
	
	/**
	 * 문제 설명
	 * 1. 문자열 배열의 각 원소의 길이를 담은 배열을 리턴
	 */
	
	// 풀이 1. 반복문으로 String 의 length() 를 배열에 담아 리턴
	// 시간 0.01ms ~ 0.01ms
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        
        for(int i = 0; i < strlist.length; i++) {
        	
        	String str = strlist[i];
        	answer[i] = str.length();
        }
        
        
        return answer;
    }
    
    public int[] solution1_1(String[] strlist) {
        int[] answer = new int[strlist.length];
        
        for(int i = 0; i < strlist.length; i++) {
        	
        	answer[i] = strlist[i].length();
        }
        
        
        return answer;
    }
    
    // 풀이 2. stream을 이용해 풀이
    // 시간 2.16ms ~ 3.79ms
    public int[] solution1(String[] strlist) {
    	
    	return Arrays.stream(strlist).mapToInt(String::length).toArray();
    }

	
	
	public static void main(String[] args) {
		Ex01 ex06 = new Ex01();
		
		String strlist[] = {"We", "are", "the", "world!"};
		
		System.out.println(Arrays.toString(ex06.solution(strlist)));
		
	}

}
