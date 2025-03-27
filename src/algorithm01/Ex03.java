package algorithm01;

import java.util.Arrays;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/120833
 */

public class Ex03 {
	
	/**
	 * 문제 설명
	 * 1. 배열과 정수 a, b가 주어질 때
	 * 2. a 번째 인덱스 ~ b 번째 인덱스까지 자른 배열을 리턴
	 */
	
	// 풀이 1. 반복문 사용
	// 시간 0.01ms ~ 0.02ms
    public int[] solution(int[] numbers, int num1, int num2) {
    	
        int[] answer = new int[num2 - num1 +1];
        
        for(int i = num1, j = 0; i <= num2; i++, j++) {
        	answer[j] = numbers[i];
        }
        
        return answer;
    }
    
    // 풀이 2. 특정 index에서 배열 잘라내기
	// 시간 0.02ms ~ 0.03ms
    public int[] solution1(int[] numbers, int num1, int num2) {
    	
        int[] answer = Arrays.copyOfRange(numbers, num1, num2 + 1);
        
        return answer;
    }
    
    
    public static void main(String[] args) {
    	Ex03 ex03 = new Ex03();
    	
    	int[] numbers = {1, 2, 3, 4, 5}; 
    	
    	System.out.println(Arrays.toString(ex03.solution1(numbers, 1, 3)));
    }

}
