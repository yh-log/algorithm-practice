package algorithm01;

import java.util.Arrays;

/**
 * 링크 https://school.programmers.co.kr/learn/courses/30/lessons/120583
 */

public class Ex05 {

	/**
	 * 문제 설명
	 * 1. 정수 배열과 정수 n이 주어질 때
	 * 2. 배열에 n의 개수를 리턴
	 */
	
	// 문제 풀이 1. 반복문 사용
	// 시간 0.01ms ~ 0.04ms
	public int solution(int[] array, int n) {
        int answer = 0;

        for(int i = 0; i < array.length; i++) {
        	if(array[i] == n) {
        		answer ++;
        	}
        }
        
        return answer;
    }
	
	// 문제 풀이 2. stream() 사용
	// 시간 0.75ms ~ 1.45ms
	public int solution2(int[] array, int n) {
        
		// 1. 배열을 스트림으로 변환해준다.
		// 2. n과 같은 값만 필터링 해준다.
		// 3. 개수를 count 한 후 return 한다.
        return (int) Arrays.stream(array)
        		.filter(x -> x == n)
        		.count(); // long 타입이기 때문에 int로 형변환 해준다.
    }
	
	
	
	
	
	public static void main(String[] args) {
		Ex05 ex05 = new Ex05();
		
		int[] arr = {1,1,2,2,33,5,5,5,5,5,5,5,5,5};
		
		System.out.println(ex05.solution2(arr, 5));
	}
	
}
