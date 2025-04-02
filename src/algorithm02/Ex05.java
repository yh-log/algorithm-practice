package algorithm02;

import java.util.Arrays;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/120889
 */

public class Ex05 {
	
	/**
	 * 문제 설명
	 * 1. 삼각형을 만들기 위해 가장 긴 변 < 다른 두 변
	 * 2. 삼각형을 만들 수 있다면 1 , 없다면 2 를 return
	 */
	
	// 풀이 1. Arrays.sort, if문 사용
	// 시간 0.37ms ~ 0.46ms
    public int solution(int[] sides) {
    	
    	Arrays.sort(sides);
    	
    	if(sides[2] < sides[0] + sides[1]) {
    		return 1;
    	}
    	
    	return 2;
    }
    
    // 풀이 2. Arrays.sort, 삼항연산자 사용
    // 시간 0.32ms ~ 0.49ms
   public int solution1(int[] sides) {
    	
    	Arrays.sort(sides);
    	
    	return (sides[2] < sides[0] + sides[1]) ? 1 : 2;
    }
    
    
    public static void main(String[] arsg) {
    	Ex05 ex05 = new Ex05();
    	int[] arr = {199, 72, 222};
    	
    	System.out.println(ex05.solution(arr));
    }

}
